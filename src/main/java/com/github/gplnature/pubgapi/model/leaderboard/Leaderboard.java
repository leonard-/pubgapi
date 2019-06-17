package com.github.gplnature.pubgapi.model.leaderboard;

import com.github.gplnature.pubgapi.model.Links;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Leaderboard extends Entity {

    @SerializedName("attributes")
    private LeaderboardAttributes leaderboardAttributes;

    @SerializedName("relationships")
    private LeaderboardRelationships leaderboardRelationships;

    @SerializedName("included")
    private List<LeaderboardPlayer> leaderboardPlayers;

    private Links links;

    public Leaderboard() {
    }
    
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
