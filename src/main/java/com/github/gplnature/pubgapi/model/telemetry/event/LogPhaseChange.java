package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogPhaseChange extends TelemetryEvent{
    
    @SerializedName("phase")
    private String phase;
    @SerializedName("elapsedTime")
    private Float elapsedTime;

    public LogPhaseChange() {
        super();
    }

    
}
