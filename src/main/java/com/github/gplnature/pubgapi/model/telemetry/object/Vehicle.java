package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vehicle {

    @JsonProperty("vehicleType")
    private String vehicleType;
    @JsonProperty("vehicleId")
    private String vehicleId;
    @JsonProperty("healthPercent")
    private float healthPercent;
    @JsonProperty("feulPercent")
    private float feulPercent;
    @JsonProperty("velocity")
    private float velocity;
    @JsonProperty("altitudeAbs")
    private float altitudeAbs;
    @JsonProperty("altitudeRel")
    private float altitudeRel;
    @JsonProperty("vehicleUniqueId")
    private int vehicleUniqueId;
    @JsonProperty("isWheelsInAir")
    private boolean isWheelsInAir;
    @JsonProperty("isInWaterVolume")
    private boolean isInWaterVolume;
    @JsonProperty("isEngineOn")
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
