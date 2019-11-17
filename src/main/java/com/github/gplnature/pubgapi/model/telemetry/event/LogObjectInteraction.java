package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogObjectInteraction extends TelemetryEventCharacter{
    
    @SerializedName("objectType")
    private String objectLocation;
    @SerializedName("objectTypeStatus")
    private String objectLocationStatus;
    @SerializedName("objectTypeAdditionalInfo")
    private String objectTypeAdditionalInfo;
    @SerializedName("objectTypeCount")
    private int objectTypeCount;

    public LogObjectInteraction() {
        super();
    }

    public String getObjectLocation() {
        return objectLocation;
    }

    public String getObjectLocationStatus() {
        return objectLocationStatus;
    }

    public String getObjectTypeAdditionalInfo() {
        return objectTypeAdditionalInfo;
    }

    public int getObjectTypeCount() {
        return objectTypeCount;
    }

}
