package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LogPlayerRevive extends TelemetryEvent {

    @JsonProperty("reviver")
    private Character Character;

    @JsonProperty("victim")
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
