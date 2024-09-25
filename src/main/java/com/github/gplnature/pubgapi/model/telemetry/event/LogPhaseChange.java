package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogPhaseChange extends TelemetryEvent{
    
    @JsonProperty("phase")
    private String phase;
    @JsonProperty("elapsedTime")
    private Float elapsedTime;

    public LogPhaseChange() {
        super();
    }

    
}
