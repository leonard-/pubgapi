package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.ObjectAdditionalInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogObjectInteraction extends TelemetryEventCharacter{
    
    @JsonProperty("objectType")
    private String objectLocation;
    @JsonProperty("objectTypeStatus")
    private String objectLocationStatus;
    @JsonProperty("objectTypeAdditionalInfo")
    private List<ObjectAdditionalInfo> objectTypeAdditionalInfo;

    public LogObjectInteraction() {
        super();
    }

    public String getObjectLocation() {
        return objectLocation;
    }

    public String getObjectLocationStatus() {
        return objectLocationStatus;
    }

    public List<ObjectAdditionalInfo> getObjectTypeAdditionalInfo() {
        return objectTypeAdditionalInfo;
    }
}
