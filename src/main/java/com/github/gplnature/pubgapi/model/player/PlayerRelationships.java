package com.github.gplnature.pubgapi.model.player;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.match.Match;
import java.util.List;

public class PlayerRelationships {

    private DataListHolder<Match> matches;

    private DataListHolder<Asset> assets;

    public PlayerRelationships() {
    }

    public List<Match> getMatches() {
        return matches.getData();
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }

    public List<Asset> getAssets() {
        return assets.getData();
    }

    public void setAssets(DataListHolder<Asset> assets) {
        this.assets = assets;
    }
}
