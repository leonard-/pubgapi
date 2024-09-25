package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogItemAttach extends TelemetryEventCharacter {

    @JsonProperty("parentItem")
    private Item parentItem;

    @JsonProperty("childItem")
    private Item childItem;

    public LogItemAttach() {
        super();
    }

    public Item getParentItem() {
        return parentItem;
    }

    public void setParentItem(Item parentItem) {
        this.parentItem = parentItem;
    }

    public Item getChildItem() {
        return childItem;
    }

    public void setChildItem(Item childItem) {
        this.childItem = childItem;
    }
}
