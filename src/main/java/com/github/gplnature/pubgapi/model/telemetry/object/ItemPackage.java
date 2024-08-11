package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ItemPackage {

    @JsonProperty("itemPackageId")
    private String itemPackageId;

    @JsonProperty("location")
    private Location location;

    @JsonProperty("items")
    private List<Item> items;

    public ItemPackage() {
    }

    public String getItemPackageId() {
        return itemPackageId;
    }

    public void setItemPackageId(String itemPackageId) {
        this.itemPackageId = itemPackageId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
