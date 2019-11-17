package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogItemPickupFromLootBox extends TelemetryEventCharacterItem {

    @SerializedName("ownerTeamId")
    private int ownerTeamId;
    @SerializedName("creatorAccountId")
    private String creatorAccountId;

    public LogItemPickupFromLootBox() {
        super();
    }

    public int getOwnerTeamId() {
        return ownerTeamId;
    }

    public String getCreatorAccountId() {
        return creatorAccountId;
    }

}
