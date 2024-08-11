package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.github.gplnature.pubgapi.model.telemetry.object.Vehicle;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogPlayerAttack extends TelemetryEvent {

    @JsonProperty("attackId")
    private Integer attackId;

    private Integer fireWeaponStackCount;

    @JsonProperty("attacker")
    private Character attacker;

    @JsonProperty("attackType")
    private AttackType attackType;

    @JsonProperty("weapon")
    private Item weapon;

    @JsonProperty("vehicle")
    private Vehicle vehicle;

    public LogPlayerAttack() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Integer getFireWeaponStackCount() {
        return fireWeaponStackCount;
    }

    public void setFireWeaponStackCount(Integer fireWeaponStackCount) {
        this.fireWeaponStackCount = fireWeaponStackCount;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
