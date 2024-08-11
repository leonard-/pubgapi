package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.SeasonState;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogMatchDefinition extends TelemetryEvent {

    @JsonProperty("MatchId")
    private String matchId;

    @JsonProperty("SeasonState")
    private SeasonState seasonState;

    // Deprecated base on pubg api
    @Deprecated
    @JsonProperty("PingQuality")
    private String pingQuality;

    public LogMatchDefinition() {
        super();
    }

    public String getPingQuality() {
        return pingQuality;
    }

    public void setPingQuality(String pingQuality) {
        this.pingQuality = pingQuality;
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
