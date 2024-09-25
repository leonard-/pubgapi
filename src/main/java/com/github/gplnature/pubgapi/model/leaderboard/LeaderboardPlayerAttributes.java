package com.github.gplnature.pubgapi.model.leaderboard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LeaderboardPlayerAttributes {

    private String name;

    private Integer rank;

    @JsonProperty("stats")
    private LeaderboardPlayerAttributesStats leaderboardPlayerAttributesStats;

    public LeaderboardPlayerAttributes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public LeaderboardPlayerAttributesStats getLeaderboardPlayerAttributesStats() {
        return leaderboardPlayerAttributesStats;
    }

    public void setLeaderboardPlayerAttributesStats(LeaderboardPlayerAttributesStats leaderboardPlayerAttributesStats) {
        this.leaderboardPlayerAttributesStats = leaderboardPlayerAttributesStats;
    }
}
