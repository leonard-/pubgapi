package com.github.gplnature.pubgapi.model.player;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.generic.Entity;
import java.util.List;

public class PlayerRelationships {

    private DataListHolder<Entity> matches;

    private DataListHolder<Asset> assets;

    public PlayerRelationships() {
    }

    public List<Entity> getMatches() {
        return matches.getData();
    }

    public void setMatches(DataListHolder<Entity> matches) {
        this.matches = matches;
    }

    public List<Asset> getAssets() {
        return assets.getData();
    }

    public void setAssets(DataListHolder<Asset> assets) {
        this.assets = assets;
    }
}
