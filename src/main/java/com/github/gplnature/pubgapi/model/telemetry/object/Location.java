package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {

    @JsonProperty("x")
    private Float x;

    @JsonProperty("y")
    private Float y;

    @JsonProperty("z")
    private Float z;

    public Location() {
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }
}
