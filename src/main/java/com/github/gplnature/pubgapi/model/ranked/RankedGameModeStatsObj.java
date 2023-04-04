package com.github.gplnature.pubgapi.model.ranked;

import com.google.gson.annotations.SerializedName;

public class RankedGameModeStatsObj {
    private int currentRankPoint;
    private int bestRankPoint;
    private RankedTier currentTier;
    private RankedTier bestTier;
    private int roundsPlayed;
    private double avgRank;
    @SerializedName("top10Ratio")
    private double topTenRatio;
    private double winRatio;
    private int assists;
    private int wins;
    private double kda;
    private int kills;
    private int deaths;
    private double damageDealt;
    private int dBNOs;

    public int getCurrentRankPoint() {
        return currentRankPoint;
    }

    public int getBestRankPoint() {
        return bestRankPoint;
    }

    public RankedTier getCurrentTier() {
        return currentTier;
    }

    public RankedTier getBestTier() {
        return bestTier;
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public double getAvgRank() {
        return avgRank;
    }

    public double getTopTenRatio() {
        return topTenRatio;
    }

    public double getWinRatio() {
        return winRatio;
    }

    public int getAssists() {
        return assists;
    }

    public int getWins() {
        return wins;
    }

    public double getKda() {
        return kda;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public double getDamageDealt() {
        return damageDealt;
    }

    public int getdBNOs() {
        return dBNOs;
    }
}
