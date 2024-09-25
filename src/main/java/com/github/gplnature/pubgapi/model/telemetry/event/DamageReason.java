package com.github.gplnature.pubgapi.model.telemetry.event;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DamageReason {
    @JsonProperty("ArmShot") ARM_SHOT("ArmShot"),
    @JsonProperty("HeadShot") HEAD_SHOT("HeadShot"),
    @JsonProperty("LegShot") LEG_SHOT("LegShot"),
    @JsonProperty("None") NONE("None"),
    @JsonProperty("NonSpecific") NON_SPECIFIC("NonSpecific"),
    @JsonProperty("PelvisShot") PELVIS_SHOT("PelvisShot"),
    @JsonProperty("TorsoShot") TORSO_SHOT("TorsoShot");

    private final String text;

    DamageReason(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
