package com.github.gplnature.pubgapi.model.leaderboard;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.Links;
import com.github.gplnature.pubgapi.model.generic.Entity;
import java.util.List;

public class Leaderboard extends Entity {

    @JsonProperty("attributes")
    private LeaderboardAttributes leaderboardAttributes;

    @JsonProperty("relationships")
    private LeaderboardRelationships leaderboardRelationships;

    @JsonProperty("included")
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
