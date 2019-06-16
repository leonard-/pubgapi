package net.pubgapi.model.asset;

import com.google.gson.annotations.SerializedName;
import net.pubgapi.model.generic.Entity;

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
