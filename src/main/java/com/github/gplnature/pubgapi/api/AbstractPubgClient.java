package com.github.gplnature.pubgapi.api;

import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.clan.Clan;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.github.gplnature.pubgapi.model.match.Match;
import com.github.gplnature.pubgapi.model.participant.Participant;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.roster.Roster;
import com.github.gplnature.pubgapi.model.status.Status;
import com.github.gplnature.pubgapi.model.telemetry.event.TelemetryEvent;
import com.github.gplnature.pubgapi.model.tournament.Tournament;
import com.github.gplnature.pubgapi.util.Jackson3ConverterFactory;
import com.typesafe.config.ConfigFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import tools.jackson.core.JsonGenerator;
import tools.jackson.core.JsonParser;
import tools.jackson.core.util.DefaultPrettyPrinter;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.DeserializationFeature;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationContext;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.ValueSerializer;
import tools.jackson.databind.cfg.EnumFeature;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.module.SimpleModule;

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

        // Create and register custom serializers and deserializers
        SimpleModule module = new SimpleModule();

        // Custom serializer for ZonedDateTime
        module.addSerializer(ZonedDateTime.class, new ValueSerializer<>() {
            @Override
            public void serialize(ZonedDateTime value, JsonGenerator gen, SerializationContext serializers) {
                gen.writeString(value.toString());
            }
        });

        // Custom deserializer for ZonedDateTime
        module.addDeserializer(ZonedDateTime.class, new ValueDeserializer<>() {
            @Override
            public ZonedDateTime deserialize(JsonParser p, DeserializationContext ctxt) {
                return ZonedDateTime.parse(p.getValueAsString());
            }
        });

        // Custom serializer for Instant
        module.addSerializer(Instant.class, new ValueSerializer<>() {
            @Override
            public void serialize(Instant value, JsonGenerator gen, SerializationContext serializers) {
                gen.writeString(DateTimeFormatter.ISO_INSTANT.format(value));
            }
        });

        // Custom deserializer for Entity
        module.addDeserializer(Entity.class, new ValueDeserializer<>() {
            @Override
            public Entity deserialize(JsonParser p, DeserializationContext ctxt) {
                JsonNode node = p.objectReadContext().readTree(p);
                String type = node.get("type").asString();

                return switch (type) {
                    case "player" -> ctxt.readTreeAsValue(node, Player.class);
                    case "clan" -> ctxt.readTreeAsValue(node, Clan.class);
                    case "match" -> ctxt.readTreeAsValue(node, Match.class);
                    case "status" -> ctxt.readTreeAsValue(node, Status.class);
                    case "roster" -> ctxt.readTreeAsValue(node, Roster.class);
                    case "participant" -> ctxt.readTreeAsValue(node, Participant.class);
                    case "asset" -> ctxt.readTreeAsValue(node, Asset.class);
                    case "tournament" -> ctxt.readTreeAsValue(node, Tournament.class);
                    default -> null;
                };
            }
        });

        // Custom deserializer for TelemetryEvent
        module.addDeserializer(TelemetryEvent.class, new ValueDeserializer<>() {
            @Override
            public TelemetryEvent deserialize(JsonParser p, DeserializationContext ctxt) {
                JsonNode node = p.objectReadContext().readTree(p);
                String type = node.get("_T").asString();

                try {
                    Class<?> clazz = Class.forName(TELEMETRY_PACKAGE_NAME + type);
                    return (TelemetryEvent) ctxt.readTreeAsValue(node, clazz);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

                return null;
            }
        });

        ObjectMapper mapper = JsonMapper.builder()
                .addModule(module)
                .defaultPrettyPrinter(new DefaultPrettyPrinter())
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .enable(EnumFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PubgInterface.BASE_URL)
                .addConverterFactory(Jackson3ConverterFactory.create(mapper))
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
