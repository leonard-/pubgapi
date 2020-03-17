package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;
import java.util.List;

// PC Only
public class LogPlayerMakeGroggy extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("victim")
    private Character victim;

    @SerializedName("victimWeapon")
    private String victimWeapon;

    @SerializedName("victimWeaponAdditionalInfo")
    private List<String> victimWeaponAdditionalInfo;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauserName")
    private String damageCauserName;

    @SerializedName("damageCauserAdditionalInfo")
    private List<String> damageCauserAdditionalInfo;

    @SerializedName("distance")
    private Float distance;

    @SerializedName("isAttackerInVehicle")
    private Boolean isAttackerInVehicle;

    @SerializedName("dBNOId")
    private int dBNOId;

    @SerializedName("isThroughPenetrableWall")
    private Boolean isThroughPenetrableWall;

    public LogPlayerMakeGroggy() {
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

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Boolean getAttackerInVehicle() {
        return isAttackerInVehicle;
    }

    public void setAttackerInVehicle(Boolean attackerInVehicle) {
        isAttackerInVehicle = attackerInVehicle;
    }

    public int getdBNOId() {
        return dBNOId;
    }

    public void setdBNOId(int dBNOId) {
        this.dBNOId = dBNOId;
    }

    public List<String> getDamageCauserAdditionalInfo() {
        return damageCauserAdditionalInfo;
    }

    public void setDamageCauserAdditionalInfo(List<String> damageCauserAdditionalInfo) {
        this.damageCauserAdditionalInfo = damageCauserAdditionalInfo;
    }

    public String getVictimWeapon() {
        return victimWeapon;
    }

    public void setVictimWeapon(String victimWeapon) {
        this.victimWeapon = victimWeapon;
    }

    public List<String> getVictimWeaponAdditionalInfo() {
        return victimWeaponAdditionalInfo;
    }

    public void setVictimWeaponAdditionalInfo(List<String> victimWeaponAdditionalInfo) {
        this.victimWeaponAdditionalInfo = victimWeaponAdditionalInfo;
    }

    public Boolean getThroughPenetrableWall() {
        return isThroughPenetrableWall;
    }

    public void setThroughPenetrableWall(Boolean throughPenetrableWall) {
        isThroughPenetrableWall = throughPenetrableWall;
    }
}
