package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.ItemPackage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TelemetryEvent related to a package
 */
public abstract class TelemetryEventPackage extends TelemetryEvent {

    @JsonProperty("itemPackage")
    private ItemPackage itemPackage;

    public TelemetryEventPackage() {
        super();
    }

    public ItemPackage getItemPackage() {
        return itemPackage;
    }

    public void setItemPackage(ItemPackage itemPackage) {
        this.itemPackage = itemPackage;
    }
}
