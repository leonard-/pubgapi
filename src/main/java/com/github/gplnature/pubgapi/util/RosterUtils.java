package com.github.gplnature.pubgapi.util;

import com.github.gplnature.pubgapi.exception.PubgClientException;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.github.gplnature.pubgapi.model.participant.Participant;
import com.github.gplnature.pubgapi.model.roster.Roster;
import com.github.gplnature.pubgapi.model.roster.RosterRelationships;
import java.util.List;
import java.util.stream.Collectors;

public class RosterUtils {

    private Roster roster;

    public RosterUtils(Roster roster) {
        this.roster = roster;
    }

    public List<String> getParticipantsIds() throws PubgClientException {
        return RosterUtils.getParticipantsIds(roster);
    }

    public static List<String> getParticipantsIds(Roster roster) throws PubgClientException {
        RosterRelationships rosterRelationships = roster.getRelationships();

        if (rosterRelationships == null) {
            throw new PubgClientException("Unable to get the relationships of the roster");
        }

        List<Participant> participants = rosterRelationships.getParticipants();
        if (participants == null || participants == null) {
            throw new PubgClientException("Unable to get the participants of the roster");
        }

        return participants.stream()
                .map(Entity::getId)
                .collect(Collectors.toList());
    }
}
