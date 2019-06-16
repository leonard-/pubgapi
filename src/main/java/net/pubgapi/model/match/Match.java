package net.pubgapi.model.match;

import com.google.gson.annotations.SerializedName;
import net.pubgapi.model.Links;
import net.pubgapi.model.generic.Entity;

public class Match extends Entity {

    @SerializedName("attributes")
    private MatchAttributes matchAttributes;

    @SerializedName("relationships")
    private MatchRelationships matchRelationships;

    private Links links;

    public Match() {
    }

    public MatchAttributes getAttributes() {
        return matchAttributes;
    }

    public void setMatchAttributes(MatchAttributes matchAttributes) {
        this.matchAttributes = matchAttributes;
    }

    public MatchRelationships getRelationships() {
        return matchRelationships;
    }

    public void setMatchRelationships(MatchRelationships matchRelationships) {
        this.matchRelationships = matchRelationships;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
