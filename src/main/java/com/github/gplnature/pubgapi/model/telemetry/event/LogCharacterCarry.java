package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogCharacterCarry extends TelemetryEventCharacter {

    @JsonProperty("carryState")
    private String carryState;

    public LogCharacterCarry() {
        super();
    }
}
