package com.github.gplnature.pubgapi.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.gplnature.pubgapi.exception.PubgClientException;
import com.github.gplnature.pubgapi.model.ExtendedPlatform;
import com.github.gplnature.pubgapi.model.Platform;
import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.match.Match;
import com.github.gplnature.pubgapi.model.match.MatchResponse;
import com.github.gplnature.pubgapi.model.sample.Sample;
import com.github.gplnature.pubgapi.model.telemetry.Telemetry;
import com.github.gplnature.pubgapi.model.telemetry.event.LogMatchEnd;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("SmokeTest")
public class PubgClientTest {
    private Logger log = LoggerFactory.getLogger(PubgClientTest.class);


    @Test
    void testParsingTelemetryApiUsingMatchSamples() throws PubgClientException {
        PubgClient client = new PubgClient();

        // look for sample matches that where started around 6pm UTC
        Instant eveningTwoDaysAgo = Instant.now().truncatedTo(ChronoUnit.DAYS)
            .minus(1, ChronoUnit.DAYS)
            .minus(6, ChronoUnit.HOURS);

        Sample sample = client.getSamples(Platform.CONSOLE, eveningTwoDaysAgo);

        Match matchStub = sample.getSampleRelationships().getMatches().get(0);
        MatchResponse matchResponse = client.getMatch(ExtendedPlatform.XBOX, matchStub.getId());
        Asset assetStub = matchResponse.getData().getRelationships().getAssets().get(0);
        Asset asset = findAsset(matchResponse, assetStub);

        Telemetry telemetry = client.getTelemetry(asset.getAttributes().getUrl());

        // do some sanity checks here, but what we are really testing is the parsing of telemetry events above
        long matchStartEvents = telemetry.getTelemetryEvents().stream().filter(e -> e.getType().equals("LogMatchStart")).count();
        long matchEndEvents = telemetry.getTelemetryEvents().stream().filter(e -> e.getType().equals("LogMatchEnd")).count();
        assertEquals(1, matchStartEvents);
        assertEquals(1, matchEndEvents);
    }

    private Asset findAsset(MatchResponse matchResponse, Asset assetStub) {
        return (Asset) matchResponse
                .getIncluded()
                .stream()
                .filter(i -> i.getId().equals(assetStub.getId()) && i.getType().equals(assetStub.getType()))
                .toList()
                .get(0);
    }

//    @Test
//    public void testLogMatchEndTelemetry() throws PubgClientException, JsonProcessingException {
//        PubgClient client = new PubgClient();
//
//        Telemetry telemetry = client.getTelemetry("<Telemetry URL>");
//
//        // convert object to json
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
//        mapper.setDefaultPrettyPrinter(new DefaultPrettyPrinter());
//        log.info(() -> {
//            Object[] array = telemetry.getTelemetryEvents().stream().filter(e -> e instanceof LogMatchEnd).toArray();
//            try {
//                return mapper.writeValueAsString(array);
//            } catch (JsonProcessingException e) {
//                throw new RuntimeException(e);
//            }
//        });
//    }
}
