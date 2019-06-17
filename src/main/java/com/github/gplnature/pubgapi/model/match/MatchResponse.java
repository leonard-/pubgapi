package com.github.gplnature.pubgapi.model.match;

import com.github.gplnature.pubgapi.model.Links;
import com.github.gplnature.pubgapi.model.generic.Entity;
import java.util.List;

public class MatchResponse {

    private List<Entity> included;
    private Links links;
    private Match match;

    public List<Entity> getIncluded() {
        return included;
    }

    public void setIncluded(List<Entity> included) {
        this.included = included;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match matches) {
        this.match = matches;
    }

}
