package com.github.gplnature.pubgapi.model.playerseason;

import com.github.gplnature.pubgapi.model.Links;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerSeason {

    private String type;

    @JsonProperty("attributes")
    private PlayerSeasonAttributes playerSeasonAttributes;

    @JsonProperty("relationships")
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
