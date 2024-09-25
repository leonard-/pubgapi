package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Common;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public abstract class TelemetryEvent {

    @JsonProperty("_D")
    private ZonedDateTime timestamp;

    @JsonProperty("_T")
    private String type;

    private Common common;

    public TelemetryEvent() {
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }
}
