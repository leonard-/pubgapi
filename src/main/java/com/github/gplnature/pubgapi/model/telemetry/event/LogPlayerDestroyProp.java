package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.Location;
import com.google.gson.annotations.SerializedName;

public class LogPlayerDestroyProp extends TelemetryEvent {

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("objectType")
    private String objectType;

    @SerializedName("objectLocation")
    private Location objectLocation;

    public LogPlayerDestroyProp() {
        super();
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Location getObjectLocation() {
        return objectLocation;
    }

    public void setObjectLocation(Location objectLocation) {
        this.objectLocation = objectLocation;
    }
}
