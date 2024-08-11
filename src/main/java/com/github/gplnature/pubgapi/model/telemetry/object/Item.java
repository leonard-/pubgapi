package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Item {

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("stackCount")
    private Integer stackCount;

    @JsonProperty("category")
    private String category;

    @JsonProperty("subCategory")
    private String subCategory;

    @JsonProperty("attachedItems")
    private List<String> attachedItems;

    public Item() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getStackCount() {
        return stackCount;
    }

    public void setStackCount(Integer stackCount) {
        this.stackCount = stackCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public List<String> getAttachedItems() {
        return attachedItems;
    }

    public void setAttachedItems(List<String> attachedItems) {
        this.attachedItems = attachedItems;
    }
}
