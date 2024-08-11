package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.telemetry.object.CharacterWrapper;

import java.util.List;

/**
 * TelemetryEvent related to a list of characters
 */
public abstract class TelemetryEventListCharacters extends TelemetryEvent {

    @JsonProperty("characters")
    private List<CharacterWrapper> characters;

    public TelemetryEventListCharacters() {
        super();
    }

    public List<CharacterWrapper> getCharacters() {
        return characters;
    }

    public void setCharacters(List<CharacterWrapper> characters) {
        this.characters = characters;
    }
}
