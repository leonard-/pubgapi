package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogBlackZoneEnded extends TelemetryEvent {

    @JsonProperty("survivors")
    private List<Character> survivors;

    public LogBlackZoneEnded() {
        super();
    }

    public void setSurvivors(List<Character> survivors) {
        this.survivors = survivors;
    }

    public List<Character> getSurvivors() {
        return survivors;
    }
}
