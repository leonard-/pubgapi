package com.github.gplnature.pubgapi.model.ranked;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RankedGameModeStats {
    private RankedGameModeStatsObj squad;
    @JsonProperty("squad-fpp")
    private RankedGameModeStatsObj squadfpp;

    public RankedGameModeStatsObj getSquad() {
        return squad;
    }

    public RankedGameModeStatsObj getSquadfpp() {
        return squadfpp;
    }
}
