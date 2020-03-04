package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("killCount")
    private Integer killCount;

    @SerializedName("distanceOnFoot")
    private Float distanceOnFoot;

    @SerializedName("distanceOnSwim")
    private Float distanceOnSwim;

    @SerializedName("distanceOnVehicle")
    private Float distanceOnVehicle;

    @SerializedName("distanceOnParachute")
    private Float distanceOnParachute;

    @SerializedName("distanceOnFreefall")
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
