package com.pubgapi.model.playerseason;

import com.google.gson.annotations.SerializedName;
import com.pubgapi.model.Links;

public class PlayerSeason {

    private String type;

    @SerializedName("attributes")
    private PlayerSeasonAttributes playerSeasonAttributes;

    @SerializedName("relationships")
    private PlayerSeasonRelationships playerSeasonRelationships;
    
    private Links links;

    public PlayerSeason() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public PlayerSeasonAttributes getAttributes() {
        return playerSeasonAttributes;
    }

    public void setPlayerSeasonAttributes(PlayerSeasonAttributes playerSeasonAttributes) {
        this.playerSeasonAttributes = playerSeasonAttributes;
    }

    public PlayerSeasonRelationships getRelationships() {
        return playerSeasonRelationships;
    }

    public void setPlayerSeasonRelationships(PlayerSeasonRelationships playerSeasonRelationships) {
        this.playerSeasonRelationships = playerSeasonRelationships;
    }
}
