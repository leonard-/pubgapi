package net.pubgapi.model.roster;

import java.util.List;
import net.pubgapi.model.participant.Participant;

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
