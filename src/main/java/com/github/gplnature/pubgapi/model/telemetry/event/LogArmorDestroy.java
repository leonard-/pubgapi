package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

// PC only
public class LogArmorDestroy extends TelemetryEvent {

    @JsonProperty("attackId")
    private Integer attackId;

    @JsonProperty("attacker")
    private Character attacker;

    @JsonProperty("victim")
    private Character victim;

    @JsonProperty("damageTypeCategory")
    private String damageTypeCategory;

    @JsonProperty("damageReason")
    private DamageReason damageReason;

    @JsonProperty("damageCauserName")
    private String damageCauserName;

    @JsonProperty("item")
    private Item item;

    @JsonProperty("distance")
    private Float distance;

    public LogArmorDestroy() {
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

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public DamageReason getDamageReason() {
        return damageReason;
    }

    public void setDamageReason(DamageReason damageReason) {
        this.damageReason = damageReason;
    }

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
