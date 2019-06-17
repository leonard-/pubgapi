package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Vehicle;
import com.google.gson.annotations.SerializedName;

public class LogWheelDestroy extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("vehicle")
    private Vehicle vehicle;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauseName")
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
