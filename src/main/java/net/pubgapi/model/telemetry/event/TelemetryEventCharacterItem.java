package net.pubgapi.model.telemetry.event;

import net.pubgapi.model.telemetry.object.Item;

/**
 * TelemetryEvent including a character and an item
 */
public abstract class TelemetryEventCharacterItem extends TelemetryEventCharacter {

    private Item item;

    public TelemetryEventCharacterItem() {
        super();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
