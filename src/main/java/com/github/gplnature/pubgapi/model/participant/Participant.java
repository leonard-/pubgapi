package com.github.gplnature.pubgapi.model.participant;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.generic.Entity;

public class Participant extends Entity {

    @JsonProperty("attributes")
    private ParticipantAttributes participantAttributes;

    public Participant() {
    }

    public ParticipantAttributes getAttributes() {
        return participantAttributes;
    }

    public void setParticipantAttributes(ParticipantAttributes participantAttributes) {
        this.participantAttributes = participantAttributes;
    }
}
