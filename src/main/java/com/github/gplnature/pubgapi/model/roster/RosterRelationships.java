package com.github.gplnature.pubgapi.model.roster;

import com.github.gplnature.pubgapi.model.participant.Participant;
import java.util.List;

public class RosterRelationships {

    private List<Participant> participants;

    public RosterRelationships() {
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }
}
