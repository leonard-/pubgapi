package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Vehicle;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogVehicleDestroy extends TelemetryEvent {

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

    @JsonProperty("distance")
    private Float distance;

    public LogVehicleDestroy() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public String getDamageCauseName() {
        return damageCauseName;
    }

    public void setDamageCauseName(String damageCauseName) {
        this.damageCauseName = damageCauseName;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
