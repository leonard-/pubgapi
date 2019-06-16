package net.pubgapi.model.match;

import net.pubgapi.model.generic.Entity;

import java.util.List;
import net.pubgapi.model.Links;

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
