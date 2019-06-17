package com.github.gplnature.pubgapi.model.roster;

import com.github.gplnature.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class Roster extends Entity {

    @SerializedName("attributes")
    private RosterAttributes rosterAttributes;

    @SerializedName("relationships")
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
