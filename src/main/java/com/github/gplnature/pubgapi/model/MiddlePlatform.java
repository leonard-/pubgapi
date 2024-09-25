package com.github.gplnature.pubgapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MiddlePlatform {
    @JsonProperty("steam") STEAM("steam"),
    @JsonProperty("kakao") KAKAO("kakao"),
    @JsonProperty("console") CONSOLE("console"),
    @JsonProperty("psn") PSN("psn"),
    @JsonProperty("xbox") XBOX("xbox"),
    @JsonProperty("stadia") STADIA("stadia");
    private final String text;

    MiddlePlatform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
