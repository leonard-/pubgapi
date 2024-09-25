package com.github.gplnature.pubgapi.model.asset;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.generic.Entity;

public class Asset extends Entity {

    @JsonProperty("attributes")
    private AssetAttributes assetAttributes;

    public Asset() {
    }

    public AssetAttributes getAttributes() {
        return assetAttributes;
    }

    public void setAssetAttributes(AssetAttributes assetAttributes) {
        this.assetAttributes = assetAttributes;
    }
}
