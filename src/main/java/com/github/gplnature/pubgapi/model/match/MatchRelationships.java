package com.pubgapi.model.match;

import java.util.List;
import com.pubgapi.model.asset.Asset;
import com.pubgapi.model.roster.Roster;

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
