package com.github.gplnature.pubgapi.model.asset;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class AssetAttributes {

    @JsonProperty("URL")
    private String url;

    private ZonedDateTime createdAt;

    private String description;

    private String name;

    public AssetAttributes() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}