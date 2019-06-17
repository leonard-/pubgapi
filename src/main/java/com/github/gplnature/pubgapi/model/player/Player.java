package com.pubgapi.model.player;

import com.google.gson.annotations.SerializedName;
import com.pubgapi.model.Links;
import com.pubgapi.model.generic.Entity;

public class Player extends Entity {

    @SerializedName("attributes")
    private PlayerAttributes playerAttributes;

    @SerializedName("relationships")
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
