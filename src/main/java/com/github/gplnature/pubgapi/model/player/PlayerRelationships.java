package com.github.gplnature.pubgapi.model.player;

import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.match.Match;
import java.util.List;

public class PlayerRelationships {

    private List<Match> matches;

    private List<Asset> assets;

    public PlayerRelationships() {
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
