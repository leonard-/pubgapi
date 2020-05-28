package com.github.gplnature.pubgapi.model.ranked;

import com.google.gson.annotations.SerializedName;

public class RankedGameModeStats {
    private RankedGameModeStatsObj squad;
    @SerializedName("squad-fpp")
    private RankedGameModeStatsObj squadfpp;

    public RankedGameModeStatsObj getSquad() {
        return squad;
    }

    public RankedGameModeStatsObj getSquadfpp() {
        return squadfpp;
    }
}
