package com.github.gplnature.pubgapi.model.sample;

import com.github.gplnature.pubgapi.model.match.Match;
import java.util.List;

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
