package com.pubgapi.model.roster;

import java.util.List;
import com.pubgapi.model.participant.Participant;

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
