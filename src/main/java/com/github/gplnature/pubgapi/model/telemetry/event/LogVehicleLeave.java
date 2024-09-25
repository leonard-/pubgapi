package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.github.gplnature.pubgapi.model.telemetry.object.Character;

public class LogVehicleLeave extends TelemetryEventCharacterVehicle {

    // PC Only
    @JsonProperty("rideDistance")
    private Float rideDistance;
    @JsonProperty("maxSpeed")
    private Float maxSpeed;
    @JsonProperty("fellowPassengers")
    private List<Character> fellowPassengers;

    public LogVehicleLeave() {
        super();
    }

    public Float getMaxSpeed() {
        return maxSpeed;
    }

    public List<Character> getFellowPassengers() {
        return fellowPassengers;
    }

    public Float getRideDistance() {
        return rideDistance;
    }
}
