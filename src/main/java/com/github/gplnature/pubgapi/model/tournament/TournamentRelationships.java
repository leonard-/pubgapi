package com.github.gplnature.pubgapi.model.tournament;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.match.Match;
import java.util.List;

public class TournamentRelationships {

    private DataListHolder<Match> matches;

    public TournamentRelationships() {
    }
    
    public List<Match> getMatches() {
        return matches.getData();
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }
}
