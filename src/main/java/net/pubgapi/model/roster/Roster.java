package net.pubgapi.model.roster;

import com.google.gson.annotations.SerializedName;
import net.pubgapi.model.generic.Entity;

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
