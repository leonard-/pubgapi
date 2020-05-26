package com.github.gplnature.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum ExtendedPlatform {
    @SerializedName("steam") STEAM("steam"),
    @SerializedName("kakao") KAKAO("kakao"),
    @SerializedName("console") CONSOLE("console"),
    @SerializedName("psn") PSN("psn"),
    @SerializedName("xbox") XBOX("xbox"),
    @SerializedName("stadia") STADIA("stadia"),
    @SerializedName("tournament") TOURNAMENT("tournament");

    private final String text;

    ExtendedPlatform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
