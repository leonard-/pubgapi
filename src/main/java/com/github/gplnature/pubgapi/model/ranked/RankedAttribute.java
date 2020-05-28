package com.github.gplnature.pubgapi.model.ranked;

import com.google.gson.annotations.SerializedName;

public class RankedAttribute {
    @SerializedName("rankedGameModeStats")
    private RankedGameModeStats stats;

    public RankedGameModeStats getStats() {
        return stats;
    }
}
