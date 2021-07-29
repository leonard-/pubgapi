package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LogPlayerRedeployBRStart extends TelemetryEvent {

    @SerializedName("characters")
    private List<Character> characters;

    public LogPlayerRedeployBRStart() {
        super();
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
