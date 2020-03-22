package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Character {

    @SerializedName("name")
    private String name;

    @SerializedName("teamId")
    private String teamId;

    @SerializedName("health")
    private Float health;

    @SerializedName("location")
    private Location location;

    @SerializedName("ranking")
    private Integer ranking;

    @SerializedName("accountId")
    private String accountId;

    @SerializedName("isInBlueZone")
    private Boolean isInBlueZone;

    @SerializedName("isInRedZone")
    private Boolean isInRedZone;

    @SerializedName("zone")
    private List<String> zone;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public String getTeamId() {
        return teamId;
    }

    public Float getHealth() {
        return health;
    }

    public Location getLocation() {
        return location;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getAccountId() {
        return accountId;
    }

    public Boolean getInBlueZone() {
        return isInBlueZone;
    }

    public Boolean getInRedZone() {
        return isInRedZone;
    }

    public List<String> getZone() {
        return zone;
    }
}
