package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.GameResult;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LogPlayerKill extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("killer")
    private Character killer;

    @SerializedName("victim")
    private Character victim;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauserName")
    private String damageCauserName;

    @SerializedName("damageReason")
    private String damageReason;

    @SerializedName("damageCauserAdditionalInfo")
    private List<String> damageCauserAdditionalInfo;

    @SerializedName("victimWeapon")
    private String victimWeapon;

    @SerializedName("victimWeaponAdditionalInfo")
    private List<String> victimWeaponAdditionalInfo;

    @SerializedName("distance")
    private Float distance;

    @SerializedName("victimGameResult")
    private GameResult victimGameResult;

    @SerializedName("isThroughPenetrableWall")
    private Boolean isThroughPenetrableWall;

    public LogPlayerKill() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Character getKiller() {
        return killer;
    }

    public void setKiller(Character killer) {
        this.killer = killer;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public String getVictimWeapon() {
        return victimWeapon;
    }

    public void setVictimWeapon(String victimWeapon) {
        this.victimWeapon = victimWeapon;
    }

    public List<String> getDamageCauserAdditionalInfo() {
        return damageCauserAdditionalInfo;
    }

    public void setDamageCauserAdditionalInfo(List<String> damageCauserAdditionalInfo) {
        this.damageCauserAdditionalInfo = damageCauserAdditionalInfo;
    }

    public List<String> getVictimWeaponAdditionalInfo() {
        return victimWeaponAdditionalInfo;
    }

    public void setVictimWeaponAdditionalInfo(List<String> victimWeaponAdditionalInfo) {
        this.victimWeaponAdditionalInfo = victimWeaponAdditionalInfo;
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

    public String getDamageReason() {
        return damageReason;
    }

    public void setDamageReason(String damageReason) {
        this.damageReason = damageReason;
    }

    public GameResult getVictimGameResult() {
        return victimGameResult;
    }

    public void setVictimGameResult(GameResult victimGameResult) {
        this.victimGameResult = victimGameResult;
    }

    public Boolean getThroughPenetrableWall() {
        return isThroughPenetrableWall;
    }

    public void setThroughPenetrableWall(Boolean throughPenetrableWall) {
        isThroughPenetrableWall = throughPenetrableWall;
    }
}
