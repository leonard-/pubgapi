package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class TelemetryEventCharacterVehicleItem extends TelemetryEventCharacterVehicle{

    @JsonProperty("item")
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
