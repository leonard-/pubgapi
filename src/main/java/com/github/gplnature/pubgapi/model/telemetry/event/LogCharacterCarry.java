package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogCharacterCarry extends TelemetryEventCharacter {

    @SerializedName("carryState")
    private String carryState;

    public LogCharacterCarry() {
        super();
    }
}
