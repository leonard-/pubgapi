package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats {

    @JsonProperty("killCount")
    private Integer killCount;

    @JsonProperty("distanceOnFoot")
    private Float distanceOnFoot;

    @JsonProperty("distanceOnSwim")
    private Float distanceOnSwim;

    @JsonProperty("distanceOnVehicle")
    private Float distanceOnVehicle;

    @JsonProperty("distanceOnParachute")
    private Float distanceOnParachute;

    @JsonProperty("distanceOnFreefall")
    private Float distanceOnFreefall;

    public Integer getKillCount() {
        return killCount;
    }

    public void setKillCount(Integer killCount) {
        this.killCount = killCount;
    }

    public Float getDistanceOnFoot() {
        return distanceOnFoot;
    }

    public void setDistanceOnFoot(Float distanceOnFoot) {
        this.distanceOnFoot = distanceOnFoot;
    }

    public Float getDistanceOnSwim() {
        return distanceOnSwim;
    }

    public void setDistanceOnSwim(Float distanceOnSwim) {
        this.distanceOnSwim = distanceOnSwim;
    }

    public Float getDistanceOnVehicle() {
        return distanceOnVehicle;
    }

    public void setDistanceOnVehicle(Float distanceOnVehicle) {
        this.distanceOnVehicle = distanceOnVehicle;
    }

    public Float getDistanceOnParachute() {
        return distanceOnParachute;
    }

    public void setDistanceOnParachute(Float distanceOnParachute) {
        this.distanceOnParachute = distanceOnParachute;
    }

    public Float getDistanceOnFreefall() {
        return distanceOnFreefall;
    }

    public void setDistanceOnFreefall(Float distanceOnFreefall) {
        this.distanceOnFreefall = distanceOnFreefall;
    }
}
