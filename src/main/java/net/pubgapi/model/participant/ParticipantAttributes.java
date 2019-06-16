package net.pubgapi.model.participant;

import com.google.gson.annotations.SerializedName;

public class ParticipantAttributes {

    public ParticipantAttributes() {
    }

    private String actor;

    private String shardId;

    @SerializedName("stats")
    private ParticipantStats participantStats;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public ParticipantStats getStats() {
        return participantStats;
    }

    public void setParticipantStats(ParticipantStats participantStats) {
        this.participantStats = participantStats;
    }
}
