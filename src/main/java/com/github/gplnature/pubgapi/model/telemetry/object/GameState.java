package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameState {

    @JsonProperty("elapsedTime")
    private Integer elapsedTime;

    @JsonProperty("numAliveTeams")
    private Integer numAliveTeams;

    @JsonProperty("numJoinPlayers")
    private Integer numJoinPlayers;

    @JsonProperty("numStartPlayers")
    private Integer numStartPlayers;

    @JsonProperty("numAlivePlayers")
    private Integer numAlivePlayers;

    @JsonProperty("safetyZonePosition")
    private Location safetyZonePosition;

    @JsonProperty("safetyZoneRadius")
    private Float safetyZoneRadius;

    @JsonProperty("poisonGasWarningPosition")
    private Location poisonGasWarningPosition;

    @JsonProperty("poisonGasWarningRadius")
    private Float poisonGasWarningRadius;

    @JsonProperty("redZonePosition")
    private Location redZonePosition;

    @JsonProperty("redZoneRadius")
    private Float redZoneRadius;

    @JsonProperty("blackZonePosition")
    private Location blackZonePosition;

    @JsonProperty("blackZoneRadius")
    private Float blackZoneRadius;

    public GameState() {
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getNumAliveTeams() {
        return numAliveTeams;
    }

    public void setNumAliveTeams(Integer numAliveTeams) {
        this.numAliveTeams = numAliveTeams;
    }

    public Integer getNumJoinPlayers() {
        return numJoinPlayers;
    }

    public void setNumJoinPlayers(Integer numJoinPlayers) {
        this.numJoinPlayers = numJoinPlayers;
    }

    public Integer getNumStartPlayers() {
        return numStartPlayers;
    }

    public void setNumStartPlayers(Integer numStartPlayers) {
        this.numStartPlayers = numStartPlayers;
    }

    public Integer getNumAlivePlayers() {
        return numAlivePlayers;
    }

    public void setNumAlivePlayers(Integer numAlivePlayers) {
        this.numAlivePlayers = numAlivePlayers;
    }

    public Location getSafetyZonePosition() {
        return safetyZonePosition;
    }

    public void setSafetyZonePosition(Location safetyZonePosition) {
        this.safetyZonePosition = safetyZonePosition;
    }

    public Float getSafetyZoneRadius() {
        return safetyZoneRadius;
    }

    public void setSafetyZoneRadius(Float safetyZoneRadius) {
        this.safetyZoneRadius = safetyZoneRadius;
    }

    public Location getPoisonGasWarningPosition() {
        return poisonGasWarningPosition;
    }

    public void setPoisonGasWarningPosition(Location poisonGasWarningPosition) {
        this.poisonGasWarningPosition = poisonGasWarningPosition;
    }

    public Float getPoisonGasWarningRadius() {
        return poisonGasWarningRadius;
    }

    public void setPoisonGasWarningRadius(Float poisonGasWarningRadius) {
        this.poisonGasWarningRadius = poisonGasWarningRadius;
    }

    public Location getRedZonePosition() {
        return redZonePosition;
    }

    public void setRedZonePosition(Location redZonePosition) {
        this.redZonePosition = redZonePosition;
    }

    public Float getRedZoneRadius() {
        return redZoneRadius;
    }

    public void setRedZoneRadius(Float redZoneRadius) {
        this.redZoneRadius = redZoneRadius;
    }

    public Location getBlackZonePosition() {
        return blackZonePosition;
    }

    public void setBlackZonePosition(Location blackZonePosition) {
        this.blackZonePosition = blackZonePosition;
    }

    public Float getBlackZoneRadius() {
        return blackZoneRadius;
    }

    public void setBlackZoneRadius(Float blackZoneRadius) {
        this.blackZoneRadius = blackZoneRadius;
    }
}
