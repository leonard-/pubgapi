package com.github.gplnature.pubgapi.model.tournament;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.generic.Entity;
import java.util.List;

public class TournamentRelationships {

    private DataListHolder<Entity> matches;

    public TournamentRelationships() {
    }
    
    public List<Entity> getMatches() {
        return matches.getData();
    }

    public void setMatches(DataListHolder<Entity> matches) {
        this.matches = matches;
    }
}
