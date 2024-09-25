package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogItemPickupFromLootBox extends TelemetryEventCharacterItem {

    @JsonProperty("ownerTeamId")
    private int ownerTeamId;
    @JsonProperty("creatorAccountId")
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
