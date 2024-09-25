package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import com.github.gplnature.pubgapi.model.telemetry.object.Character;

public class LogVehicleRide extends TelemetryEventCharacterVehicle {
    @JsonProperty("fellowPassengers")
    private List<Character> fellowPassengers;

    public LogVehicleRide() {
        super();
    }

    public void setFellowPassengers(List<Character> fellowPassengers) {
        this.fellowPassengers = fellowPassengers;
    }
}
