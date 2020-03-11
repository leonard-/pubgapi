package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.ObjectAdditionalInfo;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LogObjectInteraction extends TelemetryEventCharacter{
    
    @SerializedName("objectType")
    private String objectLocation;
    @SerializedName("objectTypeStatus")
    private String objectLocationStatus;
    @SerializedName("objectTypeAdditionalInfo")
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
