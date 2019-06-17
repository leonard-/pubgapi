package com.pubgapi.model.tournament;

import java.util.List;
import com.pubgapi.model.match.Match;

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
