package net.pubgapi.model.participant;

import com.google.gson.annotations.SerializedName;
import net.pubgapi.model.generic.Entity;

public class Participant extends Entity {

    @SerializedName("attributes")
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
