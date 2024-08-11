package com.github.gplnature.pubgapi.model.roster;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.generic.Entity;

public class Roster extends Entity {

    @JsonProperty("attributes")
    private RosterAttributes rosterAttributes;

    @JsonProperty("relationships")
    private RosterRelationships rosterRelationships;

    public Roster() {
    }

    public RosterAttributes getAttributes() {
        return rosterAttributes;
    }

    public void setRosterAttributes(RosterAttributes rosterAttributes) {
        this.rosterAttributes = rosterAttributes;
    }

    public RosterRelationships getRelationships() {
        return rosterRelationships;
    }

    public void setRosterRelationships(RosterRelationships rosterRelationships) {
        this.rosterRelationships = rosterRelationships;
    }
}
