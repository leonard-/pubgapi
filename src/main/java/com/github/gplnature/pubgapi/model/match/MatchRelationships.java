package com.github.gplnature.pubgapi.model.match;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.asset.Asset;
import com.github.gplnature.pubgapi.model.roster.Roster;
import java.util.List;

public class MatchRelationships {

    private DataListHolder<Roster> rosters;

    private DataListHolder<Asset> assets;

    public MatchRelationships() {
    }

    public List<Roster> getRosters() {
        return rosters.getData();
    }

    public void setRosters(DataListHolder<Roster> rosters) {
        this.rosters = rosters;
    }

    public List<Asset> getAssets() {
        return assets.getData();
    }

    public void setAssets(DataListHolder<Asset> assets) {
        this.assets = assets;
    }
}
