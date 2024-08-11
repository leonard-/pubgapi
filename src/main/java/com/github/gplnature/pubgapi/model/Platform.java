package com.github.gplnature.pubgapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum Platform {
    @JsonProperty("steam") STEAM("steam"),
    @JsonProperty("kakao") KAKAO("kakao"),
    @JsonProperty("console") CONSOLE("console");

    private final String text;

    Platform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}

