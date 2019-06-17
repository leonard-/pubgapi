package com.github.gplnature.pubgapi.model.sample;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.match.Match;
import java.util.List;

public class SampleRelationships {

    private DataListHolder<Match> matches;

    public SampleRelationships() {
    }

    public List<Match> getMatches() {
        return matches.getData();
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }
}
