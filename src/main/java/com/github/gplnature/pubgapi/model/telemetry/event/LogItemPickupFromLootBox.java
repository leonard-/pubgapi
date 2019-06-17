package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogItemPickupFromLootBox extends TelemetryEventCharacterItem {

    @SerializedName("ownerTeamId")
    private int ownerTeamId;

    public LogItemPickupFromLootBox() {
        super();
    }

    public int getOwnerTeamId() {
        return ownerTeamId;
    }

}
