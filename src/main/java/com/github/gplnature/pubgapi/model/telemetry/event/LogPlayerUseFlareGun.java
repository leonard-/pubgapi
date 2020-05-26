package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.google.gson.annotations.SerializedName;

public class LogPlayerUseFlareGun extends TelemetryEventCharacter {
    @SerializedName("attackId")
    private int attackId;
    @SerializedName("fireWeaponStackCount")
    private int fireWeaponStackCount;
    @SerializedName("attacker")
    private Character attacker;
    @SerializedName("attackType")
    private AttackType attackType;
    @SerializedName("weapon")
    private Item weapon;

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
