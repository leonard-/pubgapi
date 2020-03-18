package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Vehicle {

    @SerializedName("vehicleType")
    private String vehicleType;
    @SerializedName("vehicleId")
    private String vehicleId;
    @SerializedName("healthPercent")
    private float healthPercent;
    @SerializedName("feulPercent")
    private float feulPercent;
    @SerializedName("velocity")
    private float velocity;
    @SerializedName("altitudeAbs")
    private float altitudeAbs;
    @SerializedName("altitudeRel")
    private float altitudeRel;
    @SerializedName("vehicleUniqueId")
    private int vehicleUniqueId;
    @SerializedName("isWheelsInAir")
    private boolean isWheelsInAir;
    @SerializedName("isInWaterVolume")
    private boolean isInWaterVolume;
    @SerializedName("isEngineOn")
    private boolean isEngineOn;

    public Vehicle() {
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public float getHealthPercent() {
        return healthPercent;
    }

    public float getFeulPercent() {
        return feulPercent;
    }

    public float getVelocity() {
        return velocity;
    }

    public float getAltitudeAbs() {
        return altitudeAbs;
    }

    public float getAltitudeRel() {
        return altitudeRel;
    }

    public int getVehicleUniqueId() {
        return vehicleUniqueId;
    }

    public boolean isWheelsInAir() {
        return isWheelsInAir;
    }

    public boolean isInWaterVolume() {
        return isInWaterVolume;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }
}
