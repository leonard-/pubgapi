package com.pubgapi.model.season;

import com.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import com.pubgapi.model.Links;

public class Season extends Entity {

    @SerializedName("attributes")
    private SeasonAttributes seasonAttributes;
    private Links links;

    public Season() {
        super();
    }
    
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public SeasonAttributes getAttributes() {
        return seasonAttributes;
    }

    public void setSeasonAttributes(SeasonAttributes seasonAttributes) {
        this.seasonAttributes = seasonAttributes;
    }
}
