package com.github.gplnature.pubgapi.model.telemetry.object;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CharacterWrapper {
    @JsonProperty("character")
    private Character character;
    @JsonProperty("primaryWeaponFirst")
    private String primaryWeaponFirst;
    @JsonProperty("primaryWeaponSecond")
    private String primaryWeaponSecond;
    @JsonProperty("secondaryWeapon")
    private String secondaryWeapon;
    @JsonProperty("spawnKitIndex")
    private int isInRedZone;

    public CharacterWrapper() {
    }

    public Character getCharacter() {
        return character;
    }

    public String getPrimaryWeaponFirst() {
        return primaryWeaponFirst;
    }

    public String getPrimaryWeaponSecond() {
        return primaryWeaponSecond;
    }

    public String getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public int getIsInRedZone() {
        return isInRedZone;
    }
}
