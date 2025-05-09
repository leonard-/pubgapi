package com.github.gplnature.pubgapi.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MatchType {
    @JsonProperty("arcade") ARCADE("arcade"),
    @JsonProperty("custom") CUSTOM("custom"),
    @JsonProperty("event") EVENT("event"),
    @JsonProperty("official") OFFICIAL("official"),
    @JsonProperty("training") TRAINING("training"),
    @JsonProperty("trainingroom") TRAININGROOM("trainingroom"),
    @JsonProperty("competitive") COMPETITIVE("competitive"),
    @JsonProperty("airoyale") AIROYALE("airoyale"),
    @JsonProperty("seasonal") SEASONAL("seasonal"),
    @JsonProperty("tutorialatoz") TUTORIALATOZ("tutorialatoz"),
    @JsonEnumDefaultValue @JsonProperty("unknown") UNKNOWN("unknown");

    private final String text;

    MatchType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
