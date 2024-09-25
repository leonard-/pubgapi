package com.github.gplnature.pubgapi.model.ranked;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RankedAttribute {
    @JsonProperty("rankedGameModeStats")
    private RankedGameModeStats stats;

    public RankedGameModeStats getStats() {
        return stats;
    }
}
