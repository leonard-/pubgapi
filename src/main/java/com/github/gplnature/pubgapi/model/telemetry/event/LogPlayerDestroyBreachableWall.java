package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogPlayerDestroyBreachableWall extends TelemetryEvent {

    @JsonProperty("attacker")
    private Character attacker;

    @JsonProperty("weapon")
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
