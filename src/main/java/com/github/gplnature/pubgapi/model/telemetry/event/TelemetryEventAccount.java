package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TelemetryEvent related to an account
 */
public abstract class TelemetryEventAccount extends TelemetryEvent {

    @JsonProperty("accountId")
    private String accountId;

    public TelemetryEventAccount() {
        super();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
