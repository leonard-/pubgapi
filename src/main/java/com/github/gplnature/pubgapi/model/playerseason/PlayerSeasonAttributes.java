package com.github.gplnature.pubgapi.model.playerseason;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerSeasonAttributes {

    @JsonProperty("gameModeStats")
    private GameModeStatsWrapper gameModeStatsWrapper;

    public PlayerSeasonAttributes() {
    }

    public GameModeStatsWrapper getGameModeStats() {
        return gameModeStatsWrapper;
    }

    public void setGameModeStatsWrapper(GameModeStatsWrapper gameModeStatsWrapper) {
        this.gameModeStatsWrapper = gameModeStatsWrapper;
    }
}
