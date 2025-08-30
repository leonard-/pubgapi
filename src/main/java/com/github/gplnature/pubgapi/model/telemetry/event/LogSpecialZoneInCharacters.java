package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.ZoneInfo;

import java.util.List;

public class LogSpecialZoneInCharacters extends TelemetryEvent {

    @JsonProperty("zoneInfo")
    private ZoneInfo zoneInfo;

    @JsonProperty("charactersInZone")
    private List<Character> charactersInZone;

    public LogSpecialZoneInCharacters() {
        super();
    }

    public ZoneInfo getZoneInfo() {
        return zoneInfo;
    }

    public void setZoneInfo(ZoneInfo zoneInfo) {
        this.zoneInfo = zoneInfo;
    }

    public List<Character> getCharactersInZone() {
        return charactersInZone;
    }

    public void setCharactersInZone(List<Character> charactersInZone) {
        this.charactersInZone = charactersInZone;
    }
}
