package com.github.gplnature.pubgapi.model.season;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeasonAttributes {

    @JsonProperty("isCurrentSeason")
    private Boolean isCurrentSeason;

    @JsonProperty("isOffseason")
    private Boolean isOffSeason;

    public SeasonAttributes() {
    }

    public Boolean getCurrentSeason() {
        return isCurrentSeason;
    }

    public void setCurrentSeason(Boolean currentSeason) {
        isCurrentSeason = currentSeason;
    }

    public Boolean getOffseason() {
        return isOffSeason;
    }

    public void setOffseason(Boolean offseason) {
        isOffSeason = offseason;
    }
}
