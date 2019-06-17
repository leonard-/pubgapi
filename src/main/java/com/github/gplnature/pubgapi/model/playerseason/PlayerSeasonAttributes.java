package com.github.gplnature.pubgapi.model.playerseason;

import com.google.gson.annotations.SerializedName;

public class PlayerSeasonAttributes {

    @SerializedName("gameModeStats")
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
