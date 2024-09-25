package com.github.gplnature.pubgapi.model.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.Links;
import com.github.gplnature.pubgapi.model.generic.Entity;

public class Player extends Entity {

    @JsonProperty("attributes")
    private PlayerAttributes playerAttributes;

    @JsonProperty("relationships")
    private PlayerRelationships playerRelationships;

    private Links links;

    public Player() {
        super();
    }

    public PlayerAttributes getAttributes() {
        return playerAttributes;
    }

    public void setPlayerAttributes(PlayerAttributes playerAttributes) {
        this.playerAttributes = playerAttributes;
    }

    public PlayerRelationships getRelationships() {
        return playerRelationships;
    }

    public void setPlayerRelationships(PlayerRelationships playerRelationships) {
        this.playerRelationships = playerRelationships;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
