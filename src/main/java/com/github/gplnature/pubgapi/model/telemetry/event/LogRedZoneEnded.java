package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogRedZoneEnded extends TelemetryEvent {

    @JsonProperty("drivers")
    private List<Character> drivers;

    public List<Character> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<Character> drivers) {
        this.drivers = drivers;
    }
}
