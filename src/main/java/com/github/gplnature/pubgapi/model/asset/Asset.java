package com.github.gplnature.pubgapi.model.asset;

import com.github.gplnature.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class Asset extends Entity {

    @SerializedName("attributes")
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
