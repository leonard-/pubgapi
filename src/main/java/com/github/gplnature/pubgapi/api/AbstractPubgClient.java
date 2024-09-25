package com.github.gplnature.pubgapi.api;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.github.gplnature.pubgapi.model.match.Match;
import com.github.gplnature.pubgapi.model.participant.Participant;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.roster.Roster;
import com.github.gplnature.pubgapi.model.status.Status;
import com.github.gplnature.pubgapi.model.telemetry.event.TelemetryEvent;
import com.github.gplnature.pubgapi.model.tournament.Tournament;
import com.typesafe.config.ConfigFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public abstract class AbstractPubgClient {

    private static final String RATE_LIMIT_HEADER = "X-Ratelimit-Limit";

    private static final String RATE_LIMIT_REMAINING_HEADER = "X-Ratelimit-Remaining";

    private static final String RATE_LIMIT_RESET_HEADER = "X-Ratelimit-Reset";

    private static final String ACCEPT_HEADER = "application/vnd.api+json";

    private static final String TELEMETRY_PACKAGE_NAME = "com.github.gplnature.pubgapi.model.telemetry.event.";

    // Constant to get lifetime stats when used as the seasonId
    protected static final String LIFETIME_STATS = "lifetime";

    protected PubgInterface pubgInterface;

    private int rateLimitRemaining;

    private int rateLimit;

    private Date rateLimitReset;

    /**
     * Create a new PUBG Client
     */
    protected AbstractPubgClient() {
        this(ConfigFactory.load().getString("apiKey"));
    }

    /**
     * Create a new PUBG Client
     *
     * @param apiKey to use
     */
    protected AbstractPubgClient(String apiKey) {
        // Create a custom OkHttpClient to add the headers for all the requests
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        chain -> {
                            Request request = chain.request();

                            Request.Builder builder = request.newBuilder()
                                    .addHeader("Accept", ACCEPT_HEADER);

                            // Get all the custom header (using the @ annotation)
                            List<String> customAnnotations = chain.request().headers().values("@");
                            if (customAnnotations.contains("Auth")) {
                                builder.addHeader("Authorization", "Bearer " + apiKey);
                            }
                            builder.removeHeader("@");

                            // Execute the request
                            Response response = chain.proceed(builder.build());

                            // Set the rate limit headers if present
                            String rateLimitHeader = response.header(RATE_LIMIT_HEADER);
                            if (rateLimitHeader != null) {
                                rateLimit = Integer.parseInt(rateLimitHeader);
                            }

                            String rateLimitRemainingHeader = response.header(RATE_LIMIT_REMAINING_HEADER);
                            if (rateLimitRemainingHeader != null) {
                                rateLimitRemaining = Integer.parseInt(rateLimitRemainingHeader);
                            }

                            String rateLimitResetHeader = response.header(RATE_LIMIT_RESET_HEADER);
                            if (rateLimitResetHeader != null) {
                                rateLimitReset = new Date(Long.parseLong(rateLimitResetHeader) * 1000);
                            }

                            return response;
                        }).build();

        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .setDefaultPrettyPrinter(new DefaultPrettyPrinter());

        // Create and register custom serializers and deserializers
        SimpleModule module = new SimpleModule();

        // Custom serializer for ZonedDateTime
        module.addSerializer(ZonedDateTime.class, new JsonSerializer<ZonedDateTime>() {
            @Override
            public void serialize(ZonedDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString(value.toString());
            }
        });

        // Custom deserializer for ZonedDateTime
        module.addDeserializer(ZonedDateTime.class, new JsonDeserializer<ZonedDateTime>() {
            @Override
            public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                return ZonedDateTime.parse(p.getValueAsString());
            }
        });

        // Custom serializer for Instant
        module.addSerializer(Instant.class, new JsonSerializer<Instant>() {
            @Override
            public void serialize(Instant value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString(DateTimeFormatter.ISO_INSTANT.format(value));
            }
        });

        // Custom deserializer for Entity
        module.addDeserializer(Entity.class, new JsonDeserializer<Entity>() {
            @Override
            public Entity deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                JsonNode node = p.getCodec().readTree(p);
                String type = node.get("type").asText();

                switch (type) {
                    case "player":
                        return p.getCodec().treeToValue(node, Player.class);
                    case "match":
                        return p.getCodec().treeToValue(node, Match.class);
                    case "status":
                        return p.getCodec().treeToValue(node, Status.class);
                    case "roster":
                        return p.getCodec().treeToValue(node, Roster.class);
                    case "participant":
                        return p.getCodec().treeToValue(node, Participant.class);
                    case "asset":
                        return p.getCodec().treeToValue(node, Asset.class);
                    case "tournament":
                        return p.getCodec().treeToValue(node, Tournament.class);
                    default:
                        return null;
                }
            }
        });

        // Custom deserializer for TelemetryEvent
        module.addDeserializer(TelemetryEvent.class, new JsonDeserializer<TelemetryEvent>() {
            @Override
            public TelemetryEvent deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
                JsonNode node = p.getCodec().readTree(p);
                String type = node.get("_T").asText();

                try {
                    Class<?> clazz = Class.forName(TELEMETRY_PACKAGE_NAME + type);
                    return (TelemetryEvent) p.getCodec().treeToValue(node, clazz);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                return null;
            }
        });

        mapper.registerModule(module);

        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // Build the interface to the API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PubgInterface.BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create(mapper))
                .client(okHttpClient)
                .build();

        pubgInterface = retrofit.create(PubgInterface.class);
    }

    /**
     * Indicate how many requests you can perform before the api return an error
     *
     * @return Number of available RateLimitRemaining
     */
    public int getRateLimitRemaining() {
        return rateLimitRemaining;
    }

    /**
     * Get the rate limit (how many requests you can perform per minute)
     *
     * @return Total number of available rateLimit
     */
    public int getRateLimit() {
        return rateLimit;
    }

    /**
     * Indicate when your rate limit will be reset
     *
     * @return Date
     */
    public Date getRateLimitReset() {
        return rateLimitReset;
    }
}
