package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogEmPickupLiftOff extends  TelemetryEvent {

    @JsonProperty("instigator")
    private Character instigator;

    @JsonProperty("riders")
    private List<Character> riders;

    public LogEmPickupLiftOff() {
        super();
    }

    public Character getInstigator() {
        return instigator;
    }

    public void setInstigator(Character instigator) {
        this.instigator = instigator;
    }

    public List<Character> getRiders() {
        return riders;
    }

    public void setRiders(List<Character> riders) {
        this.riders = riders;
    }
}
