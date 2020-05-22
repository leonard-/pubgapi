package com.github.gplnature.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum MatchType {
    @SerializedName("arcade") ARCADE("arcade"),
    @SerializedName("custom") CUSTOM("custom"),
    @SerializedName("event") EVENT("event"),
    @SerializedName("official") OFFICIAL("official"),
    @SerializedName("training") TRAINING("training"),
    @SerializedName("competitive") COMPETITIVE("competitive");

    private final String text;

    MatchType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
