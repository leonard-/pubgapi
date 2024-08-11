package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.telemetry.object.Character;

public class LogPlayerUseThrowable extends TelemetryEvent{
    @JsonProperty("attackId")
    private int attackId;
    @JsonProperty("fireWeaponStackCount")
    private int fireWeaponStackCount;

    @JsonProperty("attacker")
    private Character attacker;

    @JsonProperty("attackType")
    private AttackType attackType;

    @JsonProperty("weapon")
    private Item weapon;

    public LogPlayerUseThrowable() {
        super();
    }

    public int getAttackId() {
        return attackId;
    }

    public int getFireWeaponStackCount() {
        return fireWeaponStackCount;
    }

    public Character getAttacker() {
        return attacker;
    }

    public AttackType getAttackType() {
        return attackType;
    }

    public Item getWeapon() {
        return weapon;
    }

}
