package net.pubgapi.model.tournament;

import java.util.List;
import net.pubgapi.model.match.Match;

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
