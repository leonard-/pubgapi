/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LogVaultStart extends TelemetryEventCharacter {

    @JsonProperty("isLedgeGrab")
    private Boolean isLedgeGrab;

    public LogVaultStart() {
        super();
    }

    public Boolean getLedgeGrab() {
        return isLedgeGrab;
    }
}
