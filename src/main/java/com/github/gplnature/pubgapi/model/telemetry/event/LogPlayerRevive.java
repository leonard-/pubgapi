package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

public class LogPlayerRevive extends TelemetryEvent {

    @SerializedName("reviver")
    private Character Character;

    @SerializedName("victim")
    private Character victim;

    public LogPlayerRevive() {
        super();
    }

    public Character getCharacter() {
        return Character;
    }

    public void setCharacter(Character Character) {
        this.Character = Character;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }
}
