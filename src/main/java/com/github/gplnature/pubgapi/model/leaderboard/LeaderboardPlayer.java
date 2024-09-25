package com.github.gplnature.pubgapi.model.leaderboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.generic.Entity;

public class LeaderboardPlayer extends Entity {

    @JsonProperty("attributes")
    private LeaderboardPlayerAttributes leaderboardPlayerAttributes;

    public LeaderboardPlayer() {
    }

    public LeaderboardPlayerAttributes getLeaderboardPlayerAttributes() {
        return leaderboardPlayerAttributes;
    }

    public void setLeaderboardPlayerAttributes(LeaderboardPlayerAttributes leaderboardPlayerAttributes) {
        this.leaderboardPlayerAttributes = leaderboardPlayerAttributes;
    }
}
