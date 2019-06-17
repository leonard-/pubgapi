package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.ItemPackage;
import com.google.gson.annotations.SerializedName;

/**
 * TelemetryEvent related to a package
 */
public abstract class TelemetryEventPackage extends TelemetryEvent {

    @SerializedName("itemPackage")
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
