package com.github.gplnature.pubgapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum PlatformRegion {
    @JsonProperty("xbox-as") XBOX_AS("xbox-as"),
    @JsonProperty("xbox-eu") XBOX_EU("xbox-eu"),
    @JsonProperty("xbox-na") XBOX_NA("xbox-na"),
    @JsonProperty("xbox-oc") XBOX_OC("xbox-oc"),
    @JsonProperty("xbox-sa") XBOX_SA("xbox_sa"),
    @JsonProperty("psn-as") PSN_AS("psn-as"),
    @JsonProperty("psn-eu") PSN_EU("psn-eu"),
    @JsonProperty("psn-na") PSN_NA("psn-na"),
    @JsonProperty("psn-oc") PSN_OC("psn-oc"),
    @JsonProperty("pc-krip") PC_KRJP("pc-krjp"),
    @JsonProperty("pc-jp") PC_JP("pc-jp"),
    @JsonProperty("pc-na") PC_NA("pc-na"),
    @JsonProperty("pc-eu") PC_EU("pc-eu"),
    @JsonProperty("pc-ru") PC_RU("pc-ru"),
    @JsonProperty("pc-oc") PC_OC("pc-oc"),
    @JsonProperty("pc-kakao") PC_KAKAO("pc-kakao"),
    @JsonProperty("pc-sea") PC_SEA("pc-sea"),
    @JsonProperty("pc-sa") PC_SA("pc-sa"),
    @JsonProperty("pc-as") PC_AS("pc-as");

    private final String text;

    PlatformRegion(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}