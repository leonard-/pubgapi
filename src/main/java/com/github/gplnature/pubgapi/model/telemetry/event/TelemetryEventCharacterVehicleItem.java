package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.google.gson.annotations.SerializedName;

public abstract class TelemetryEventCharacterVehicleItem extends TelemetryEventCharacterVehicle{

    @SerializedName("item")
    private Item item;

    public TelemetryEventCharacterVehicleItem() {
        super();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
