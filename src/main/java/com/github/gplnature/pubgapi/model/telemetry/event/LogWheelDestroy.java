package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Vehicle;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogWheelDestroy extends TelemetryEvent {

    @JsonProperty("attackId")
    private Integer attackId;

    @JsonProperty("attacker")
    private Character attacker;

    @JsonProperty("vehicle")
    private Vehicle vehicle;

    @JsonProperty("damageTypeCategory")
    private String damageTypeCategory;

    @JsonProperty("damageCauseName")
    private String damageCauseName;

    public LogWheelDestroy() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Character getAttacker() {
        return attacker;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public String getDamageCauseName() {
        return damageCauseName;
    }
}
