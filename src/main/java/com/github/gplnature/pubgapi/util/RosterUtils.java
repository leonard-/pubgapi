package com.pubgapi.util;

import java.util.List;
import java.util.stream.Collectors;
import com.pubgapi.exception.PubgClientException;
import com.pubgapi.model.generic.Entity;
import com.pubgapi.model.participant.Participant;
import com.pubgapi.model.roster.Roster;
import com.pubgapi.model.roster.RosterRelationships;

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
