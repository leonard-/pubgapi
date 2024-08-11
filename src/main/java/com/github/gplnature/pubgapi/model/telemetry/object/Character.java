package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Character {

    @JsonProperty("name")
    private String name;

    @JsonProperty("teamId")
    private String teamId;

    @JsonProperty("individualRanking")
    private Integer individualRanking;

    @JsonProperty("inSpecialZone")
    private String inSpecialZone;

    @JsonProperty("health")
    private Float health;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("ranking")
    private Integer ranking;

    @JsonProperty("accountId")
    private String accountId;

    @JsonProperty("isInBlueZone")
    private Boolean isInBlueZone;

    @JsonProperty("isInRedZone")
    private Boolean isInRedZone;

    @JsonProperty("isInVehicle")
    private Boolean isInVehicle;

    @JsonProperty("type")
    private String type;

    @JsonProperty("zone")
    private List<String> zone;

    public Character() {
    }

    public String getType() {
        return type;
    }

    public Boolean getInVehicle() {
        return isInVehicle;
    }

    public Integer getIndividualRanking() {
        return individualRanking;
    }

    public String getInSpecialZone() {
        return inSpecialZone;
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
