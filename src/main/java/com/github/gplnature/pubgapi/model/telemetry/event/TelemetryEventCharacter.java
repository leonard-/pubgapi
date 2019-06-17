package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;

/**
 * TelemetryEvent including a CharacterObj
 */
public abstract class TelemetryEventCharacter extends TelemetryEvent {

    private Character Character;

    public TelemetryEventCharacter() {
        super();
    }

    public Character getCharacter() {
        return Character;
    }

    public void setCharacter(Character Character) {
        this.Character = Character;
    }
}
