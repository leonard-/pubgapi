package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class GameResult {

    @SerializedName("rank")
    private Integer rank;

    @SerializedName("gameResult")
    private String gameResult;

    @SerializedName("teamId")
    private Integer teamId;

    @SerializedName("stats")
    private Stats stats;

    @SerializedName("accountId")
    private String accountId;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getGameResult() {
        return gameResult;
    }

    public void setGameResult(String gameResult) {
        this.gameResult = gameResult;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
