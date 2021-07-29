package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DamageInfo {

    @SerializedName("damageReason")
    private String damageReason;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauserName")
    private String damageCauserName;

    @SerializedName("additionalInfo")
    private List<String> additionalInfo;

    @SerializedName("distance")
    private Float distance;

    @SerializedName("isThroughPenetrableWall")
    private boolean isThroughPenetrableWall;

    public DamageInfo() {
    }

    public String getDamageReason() {
        return damageReason;
    }

    public void setDamageReason(String damageReason) {
        this.damageReason = damageReason;
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

    public List<String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(List<String> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public boolean isThroughPenetrableWall() {
        return isThroughPenetrableWall;
    }

    public void setThroughPenetrableWall(boolean throughPenetrableWall) {
        isThroughPenetrableWall = throughPenetrableWall;
    }
}
