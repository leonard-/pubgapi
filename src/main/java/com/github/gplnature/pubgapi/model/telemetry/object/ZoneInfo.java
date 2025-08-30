package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ZoneInfo {

    @JsonProperty("zoneType")
    private String zoneType;

    @JsonProperty("position")
    private Location position;

    @JsonProperty("horizontalRadius")
    private Integer horizontalRadius;

    @JsonProperty("verticalRadius")
    private Integer verticalRadius;

    @JsonProperty("uniqueId")
    private Integer uniqueId;

    @JsonProperty("zoneState")
    private String zoneState;

    public ZoneInfo() {
    }

    public String getZoneType() {
        return zoneType;
    }

    public void setZoneType(String zoneType) {
        this.zoneType = zoneType;
    }

    public Location getPosition() {
        return position;
    }

    public void setPosition(Location position) {
        this.position = position;
    }

    public Integer getHorizontalRadius() {
        return horizontalRadius;
    }

    public void setHorizontalRadius(Integer horizontalRadius) {
        this.horizontalRadius = horizontalRadius;
    }

    public Integer getVerticalRadius() {
        return verticalRadius;
    }

    public void setVerticalRadius(Integer verticalRadius) {
        this.verticalRadius = verticalRadius;
    }

    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getZoneState() {
        return zoneState;
    }

    public void setZoneState(String zoneState) {
        this.zoneState = zoneState;
    }
}
