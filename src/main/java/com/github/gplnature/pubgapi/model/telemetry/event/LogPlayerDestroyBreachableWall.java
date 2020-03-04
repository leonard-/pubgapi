package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.google.gson.annotations.SerializedName;

public class LogPlayerDestroyBreachableWall extends TelemetryEvent {

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("weapon")
    private Item weapon;

    public LogPlayerDestroyBreachableWall() {
        super();
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }
}
