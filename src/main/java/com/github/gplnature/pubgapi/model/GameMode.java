package com.github.gplnature.pubgapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum GameMode {
    @JsonProperty("duo") DUO("duo"),
    @JsonProperty("duo-fpp") DUO_FPP("duo-fpp"),
    @JsonProperty("solo") SOLO("solo"),
    @JsonProperty("solo-fpp") SOLO_FPP("solo-fpp"),
    @JsonProperty("squad") SQUAD("squad"),
    @JsonProperty("squad-fpp") SQUAD_FPP("squad-fpp"),
    @JsonProperty("normal-duo") NORMAL_DUO("normal-duo"),
    @JsonProperty("normal-duo-fpp") NORMAL_DUO_FPP("normal-duo-fpp"),
    @JsonProperty("normal-solo") NORMAL_SOLO("normal-solo"),
    @JsonProperty("normal-solo-fpp") NORMAL_SOLO_FPP("normal-solo-fpp"),
    @JsonProperty("normal-squad") NORMAL_SQUAD("normal-squad"),
    @JsonProperty("normal-squad-fpp") NORMAL_SQUAD_FPP("normal-squad-fpp"),
    @JsonProperty("conquest-duo") CONQUEST_DUO("conquest-duo"),
    @JsonProperty("conquest-duo-fpp") CONQUEST_DUO_FPP("conquest-duo-fpp"),
    @JsonProperty("conquest-solo") CONQUEST_SOLO("conquest-solo"),
    @JsonProperty("conquest-solo-fpp") CONQUEST_SOLO_FPP("conquest-solo-fpp"),
    @JsonProperty("conquest-squad") CONQUEST_SQUAD("conquest-squad"),
    @JsonProperty("conquest-squad-fpp") CONQUEST_SQUAD_FPP("conquest-squad-fpp"),
    @JsonProperty("esports-duo") ESPORTS_DUO("esports-duo"),
    @JsonProperty("esports-duo-fpp") ESPORTS_DUO_FPP("esports-duo-fpp"),
    @JsonProperty("esports-solo") ESPORTS_SOLO("esports-solo"),
    @JsonProperty("esports-solo-fpp") ESPORTS_SOLO_FPP("esports-solo-fpp"),
    @JsonProperty("esports-squad") ESPORTS_SQUAD("esports-squad"),
    @JsonProperty("esports-squad-fpp") ESPORTS_SQUAD_FPP("esports-squad-fpp"),
    @JsonProperty("war-duo") WAR_DUO("war-duo"),
    @JsonProperty("war-duo-fpp") WAR_DUO_FPP("war-duo-fpp"),
    @JsonProperty("war-solo") WAR_SOLO("war-solo"),
    @JsonProperty("war-solo-fpp") WAR_SOLO_FPP("war-solo-fpp"),
    @JsonProperty("war-squad") WAR_SQUAD("war-squad"),
    @JsonProperty("war-squad-fpp") WAR_SQUAD_FPP("war-squad-fpp"),
    @JsonProperty("zombie-duo") ZOMBIE_DUO("zombie-duo"),
    @JsonProperty("zombie-duo-fpp") ZOMBIE_DUO_FPP("zombie-duo-fpp"),
    @JsonProperty("zombie-solo") ZOMBIE_SOLO("zombie-solo"),
    @JsonProperty("zombie-solo-fpp") ZOMBIE_SOLO_FPP("zombie-solo-fpp"),
    @JsonProperty("zombie-squad") ZOMBIE_SQUAD("zombie-squad"),
    @JsonProperty("zombie-squad-fpp") ZOMBIE_SQUAD_FPP("zombie-squad-fpp"),
    @JsonProperty("lab") LAB("lab"),
    @JsonProperty("lab-fpp") LAB_FPP("lab-fpp"),
    @JsonProperty("tdm") TEAM_DEATHMATCH("tdm");

    private final String text;

    GameMode(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}