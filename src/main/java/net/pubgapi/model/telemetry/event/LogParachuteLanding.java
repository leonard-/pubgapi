/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pubgapi.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Nature <Nature At GPL(GGWP PLAY LEAGUE)>
 */
public class LogParachuteLanding extends TelemetryEventCharacter {

    @SerializedName("distance")
    private Float distance;
    
    public LogParachuteLanding() {
        super();
    }

    public Float getDistance() {
        return distance;
    }
    
}