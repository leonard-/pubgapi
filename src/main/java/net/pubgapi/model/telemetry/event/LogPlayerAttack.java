package net.pubgapi.model.telemetry.event;

import net.pubgapi.model.telemetry.object.Character;
import net.pubgapi.model.telemetry.object.Item;
import net.pubgapi.model.telemetry.object.Vehicle;
import com.google.gson.annotations.SerializedName;

public class LogPlayerAttack extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    private Integer fireWeaponStackCount;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("attackType")
    private AttackType attackType;

    @SerializedName("weapon")
    private Item weapon;

    @SerializedName("vehicle")
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
