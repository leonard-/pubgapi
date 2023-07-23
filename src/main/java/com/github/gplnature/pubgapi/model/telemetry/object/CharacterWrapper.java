package com.github.gplnature.pubgapi.model.telemetry.object;

import com.google.gson.annotations.SerializedName;


public class CharacterWrapper {
    @SerializedName("character")
    private Character character;
    @SerializedName("primaryWeaponFirst")
    private String primaryWeaponFirst;
    @SerializedName("primaryWeaponSecond")
    private String primaryWeaponSecond;
    @SerializedName("secondaryWeapon")
    private String secondaryWeapon;
    @SerializedName("spawnKitIndex")
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
