package com.github.gplnature.pubgapi.model.ranked;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RankedGameModeStats {
    @JsonProperty("duo")
    private RankedGameModeStatsObj duo;
    @JsonProperty("duo-fpp")
    private RankedGameModeStatsObj duofpp;
    @JsonProperty("squad")
    private RankedGameModeStatsObj squad;
    @JsonProperty("squad-fpp")
    private RankedGameModeStatsObj squadfpp;
    @JsonProperty("All")
    private RankedGameModeStatsObj all;

    public RankedGameModeStatsObj getDuo() {
        return duo;
    }

    public RankedGameModeStatsObj getDuofpp() {
        return duofpp;
    }

    public RankedGameModeStatsObj getSquad() {
        return squad;
    }

    public RankedGameModeStatsObj getSquadfpp() {
        return squadfpp;
    }

    public RankedGameModeStatsObj getAll() {
        return all;
    }
}
