package com.github.gplnature.pubgapi.model.leaderboard;

public class LeaderboardPlayerAttributesStats {

    private Double rankPoints;

    private Integer wins;

    private Integer games;

    @Deprecated
    private Double winRatio;

    private Double kda;

    private Integer averageDamage;

    private Integer kills;

    @Deprecated
    private Double killDeathRatio;

    private String tier;

    private String subTier;

    public LeaderboardPlayerAttributesStats() {
    }

    public Double getKda() {
        return kda;
    }

    public String getTier() {
        return tier;
    }

    public String getSubTier() {
        return subTier;
    }

    public Double getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(Double rankPoints) {
        this.rankPoints = rankPoints;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    @Deprecated
    public Double getWinRatio() {
        return winRatio;
    }

    public Integer getAverageDamage() {
        return averageDamage;
    }

    public void setAverageDamage(Integer averageDamage) {
        this.averageDamage = averageDamage;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    @Deprecated
    public Double getKillDeathRatio() {
        return killDeathRatio;
    }
}
