/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogParachuteLanding extends TelemetryEventCharacter {

    @JsonProperty("distance")
    private Float distance;

    public LogParachuteLanding() {
        super();
    }

    public Float getDistance() {
        return distance;
    }

}
