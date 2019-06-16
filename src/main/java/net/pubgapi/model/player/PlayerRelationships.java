package net.pubgapi.model.player;

import java.util.List;
import net.pubgapi.model.asset.Asset;
import net.pubgapi.model.match.Match;

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
