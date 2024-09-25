package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogPlayerTakeDamage extends TelemetryEvent {

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

    // 1.0 damage = 1.0 health
    // Net damage after armor; damage to health
    @JsonProperty("damage")
    private Float damage;

    @JsonProperty("damageCauserName")
    private String damageCauserName;

    @JsonProperty("isThroughPenetrableWall")
    private Boolean isThroughPenetrableWall;

    public LogPlayerTakeDamage() {
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

    public Float getDamage() {
        return damage;
    }

    public void setDamage(Float damage) {
        this.damage = damage;
    }

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Boolean getThroughPenetrableWall() {
        return isThroughPenetrableWall;
    }

    public void setThroughPenetrableWall(Boolean throughPenetrableWall) {
        isThroughPenetrableWall = throughPenetrableWall;
    }
}
