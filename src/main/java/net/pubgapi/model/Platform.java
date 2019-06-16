package net.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum Platform {
    @SerializedName("steam") STEAM("steam"),
    @SerializedName("psn") PSN("psn"),
    @SerializedName("kakao") KAKAO("kakao"),
    @SerializedName("xbox") XBOX("xbox"),
    @SerializedName("tournament") TOURNAMENT("tournament");

    private final String text;

    Platform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
