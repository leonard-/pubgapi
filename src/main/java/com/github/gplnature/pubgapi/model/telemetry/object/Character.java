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

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Float getHealth() {
        return health;
    }

    public void setHealth(Float health) {
        this.health = health;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Boolean getInBlueZone() {
        return isInBlueZone;
    }

    public void setInBlueZone(Boolean inBlueZone) {
        isInBlueZone = inBlueZone;
    }

    public Boolean getInRedZone() {
        return isInRedZone;
    }

    public void setInRedZone(Boolean inRedZone) {
        isInRedZone = inRedZone;
    }

    public List<String> getZone() {
        return zone;
    }

    public void setZone(List<String> zone) {
        this.zone = zone;
    }
}
