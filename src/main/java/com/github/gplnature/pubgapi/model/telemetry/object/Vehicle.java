package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Vehicle {

    @SerializedName("vehicleType")
    private String vehicleType;

    @SerializedName("vehicleId")
    private String vehicleId;

    @SerializedName("healthPercent")
    private Float healthPercent;

    @SerializedName("feulPercent")
    private Float feulPercent;
    @SerializedName("vehicleUniqueId")
    private int vehicleUniqueId;
    @SerializedName("isWheelsInAir")
    private boolean isWheelsInAir;
    @SerializedName("isInWaterVolume")
    private boolean isInWaterVolume;

    public Vehicle() {
    }

    public int getVehicleUniqueId() {
        return vehicleUniqueId;
    }

    public boolean isIsWheelsInAir() {
        return isWheelsInAir;
    }

    public boolean isIsInWaterVolume() {
        return isInWaterVolume;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Float getHealthPercent() {
        return healthPercent;
    }

    public void setHealthPercent(Float healthPercent) {
        this.healthPercent = healthPercent;
    }

    public Float getFeulPercent() {
        return feulPercent;
    }

    public void setFeulPercent(Float feulPercent) {
        this.feulPercent = feulPercent;
    }
}
