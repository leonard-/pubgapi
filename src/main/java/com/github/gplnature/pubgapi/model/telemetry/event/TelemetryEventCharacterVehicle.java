package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Vehicle;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TelemetryEvent including a character and a vehicle
 */
public abstract class TelemetryEventCharacterVehicle extends TelemetryEventCharacter {

    @JsonProperty("vehicle")
    private Vehicle vehicle;

    // PC Only
    @JsonProperty("seatIndex")
    private Integer seatIndex;

    public TelemetryEventCharacterVehicle() {
        super();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getSeatIndex() {
        return seatIndex;
    }

    public void setSeatIndex(Integer seatIndex) {
        this.seatIndex = seatIndex;
    }
}
