package com.github.gplnature.pubgapi.model.tournament;

import com.github.gplnature.pubgapi.model.match.Match;
import java.util.List;

public class TournamentRelationships {

    private List<Match> matches;

    public TournamentRelationships() {
    }
    
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
