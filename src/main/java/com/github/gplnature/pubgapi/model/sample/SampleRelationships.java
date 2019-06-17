package com.pubgapi.model.sample;

import java.util.List;
import com.pubgapi.model.match.Match;

public class SampleRelationships {

    private List<Match> matches;

    public SampleRelationships() {
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
