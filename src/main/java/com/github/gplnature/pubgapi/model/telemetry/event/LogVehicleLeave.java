package com.github.gplnature.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.github.gplnature.pubgapi.model.telemetry.object.Character;

public class LogVehicleLeave extends TelemetryEventCharacterVehicle {

    // PC Only
    @SerializedName("rideDistance")
    private Float rideDistance;
    @SerializedName("maxSpeed")
    private Float maxSpeed;
    @SerializedName("fellowPassengers")
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
