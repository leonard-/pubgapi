package com.github.gplnature.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum GameMode {
    @SerializedName("duo") DUO("duo"),
    @SerializedName("duo-fpp") DUO_FPP("duo-fpp"),
    @SerializedName("solo") SOLO("solo"),
    @SerializedName("solo-fpp") SOLO_FPP("solo-fpp"),
    @SerializedName("squad") SQUAD("squad"),
    @SerializedName("squad-fpp") SQUAD_FPP("squad-fpp"),
    @SerializedName("normal-duo") NORMAL_DUO("normal-duo"),
    @SerializedName("normal-duo-fpp") NORMAL_DUO_FPP("normal-duo-fpp"),
    @SerializedName("normal-solo") NORMAL_SOLO("normal-solo"),
    @SerializedName("normal-solo-fpp") NORMAL_SOLO_FPP("normal-solo-fpp"),
    @SerializedName("normal-squad") NORMAL_SQUAD("normal-squad"),
    @SerializedName("normal-squad-fpp") NORMAL_SQUAD_FPP("normal-squad-fpp"),
    @SerializedName("conquest-duo") CONQUEST_DUO("conquest-duo"),
    @SerializedName("conquest-duo-fpp") CONQUEST_DUO_FPP("conquest-duo-fpp"),
    @SerializedName("conquest-solo") CONQUEST_SOLO("conquest-solo"),
    @SerializedName("conquest-solo-fpp") CONQUEST_SOLO_FPP("conquest-solo-fpp"),
    @SerializedName("conquest-squad") CONQUEST_SQUAD("conquest-squad"),
    @SerializedName("conquest-squad-fpp") CONQUEST_SQUAD_FPP("conquest-squad-fpp"),
    @SerializedName("esports-duo") ESPORTS_DUO("esports-duo"),
    @SerializedName("esports-duo-fpp") ESPORTS_DUO_FPP("esports-duo-fpp"),
    @SerializedName("esports-solo") ESPORTS_SOLO("esports-solo"),
    @SerializedName("esports-solo-fpp") ESPORTS_SOLO_FPP("esports-solo-fpp"),
    @SerializedName("esports-squad") ESPORTS_SQUAD("esports-squad"),
    @SerializedName("esports-squad-fpp") ESPORTS_SQUAD_FPP("esports-squad-fpp"),
    @SerializedName("war-duo") WAR_DUO("war-duo"),
    @SerializedName("war-duo-fpp") WAR_DUO_FPP("war-duo-fpp"),
    @SerializedName("war-solo") WAR_SOLO("war-solo"),
    @SerializedName("war-solo-fpp") WAR_SOLO_FPP("war-solo-fpp"),
    @SerializedName("war-squad") WAR_SQUAD("war-squad"),
    @SerializedName("war-squad-fpp") WAR_SQUAD_FPP("war-squad-fpp"),
    @SerializedName("zombie-duo") ZOMBIE_DUO("zombie-duo"),
    @SerializedName("zombie-duo-fpp") ZOMBIE_DUO_FPP("zombie-duo-fpp"),
    @SerializedName("zombie-solo") ZOMBIE_SOLO("zombie-solo"),
    @SerializedName("zombie-solo-fpp") ZOMBIE_SOLO_FPP("zombie-solo-fpp"),
    @SerializedName("zombie-squad") ZOMBIE_SQUAD("zombie-squad"),
    @SerializedName("zombie-squad-fpp") ZOMBIE_SQUAD_FPP("zombie-squad-fpp"),
    @SerializedName("lab") LAB("lab"),
    @SerializedName("lab-fpp") LAB_FPP("lab-fpp");

    private final String text;

    GameMode(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}