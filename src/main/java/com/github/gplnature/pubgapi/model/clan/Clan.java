package com.github.gplnature.pubgapi.model.clan;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.Links;
import com.github.gplnature.pubgapi.model.generic.Entity;

public class Clan extends Entity {

    @JsonProperty("attributes")
    private ClanAttributes clanAttributes;

    private Links links;

    public Clan() {
        super();
    }

    public ClanAttributes getClanAttributes() {
        return clanAttributes;
    }

    public void setClanAttributes(ClanAttributes clanAttributes) {
        this.clanAttributes = clanAttributes;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
