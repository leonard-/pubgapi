/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import net.pubgapi.model.telemetry.object.Location;

public class LogObjectDestroy extends TelemetryEventCharacter {

    @SerializedName("objectType")
    private String objectType;

    @SerializedName("objectLocation")
    private Location objectLocation;

    public LogObjectDestroy() {
        super();
    }

    public String getObjectType() {
        return objectType;
    }

    public Location getObjectLocation() {
        return objectLocation;
    }

}
