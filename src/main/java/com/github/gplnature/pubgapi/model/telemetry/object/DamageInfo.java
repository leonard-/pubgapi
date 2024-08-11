package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DamageInfo {

    @JsonProperty("damageReason")
    private String damageReason;

    @JsonProperty("damageTypeCategory")
    private String damageTypeCategory;

    @JsonProperty("damageCauserName")
    private String damageCauserName;

    @JsonProperty("additionalInfo")
    private List<String> additionalInfo;

    @JsonProperty("distance")
    private Float distance;

    @JsonProperty("isThroughPenetrableWall")
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
