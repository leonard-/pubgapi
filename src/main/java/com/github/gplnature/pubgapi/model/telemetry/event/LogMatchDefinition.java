package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.SeasonState;
import com.google.gson.annotations.SerializedName;

public class LogMatchDefinition extends TelemetryEvent {

    @SerializedName("MatchId")
    private String matchId;

    @SerializedName("SeasonState")
    private SeasonState seasonState;

    public LogMatchDefinition() {
        super();
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public SeasonState getSeasonState() {
        return seasonState;
    }

    public void setSeasonState(SeasonState seasonState) {
        this.seasonState = seasonState;
    }
}
