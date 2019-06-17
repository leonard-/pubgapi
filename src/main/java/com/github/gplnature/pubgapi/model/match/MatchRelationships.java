package com.github.gplnature.pubgapi.model.match;

import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.roster.Roster;
import java.util.List;

public class MatchRelationships {

    private List<Roster> rosters;

    private List<Asset> assets;

    public MatchRelationships() {
    }

    public List<Roster> getRosters() {
        return rosters;
    }

    public void setRosters(List<Roster> rosters) {
        this.rosters = rosters;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
