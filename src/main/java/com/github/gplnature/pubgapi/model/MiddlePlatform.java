package com.github.gplnature.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum MiddlePlatform {
    @SerializedName("steam") STEAM("steam"),
    @SerializedName("kakao") KAKAO("kakao"),
    @SerializedName("console") CONSOLE("console"),
    @SerializedName("psn") PSN("psn"),
    @SerializedName("xbox") XBOX("xbox"),
    @SerializedName("stadia") STADIA("stadia");
    private final String text;

    MiddlePlatform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
