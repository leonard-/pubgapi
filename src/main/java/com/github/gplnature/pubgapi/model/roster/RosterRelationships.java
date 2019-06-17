package com.github.gplnature.pubgapi.model.roster;

import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.participant.Participant;
import java.util.List;

public class RosterRelationships {

    private DataListHolder<Participant> participants;

    public RosterRelationships() {
    }

    public List<Participant> getParticipants() {
        return participants.getData();
    }

    public void setParticipants(DataListHolder<Participant> participants) {
        this.participants = participants;
    }
}
