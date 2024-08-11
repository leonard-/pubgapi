package com.github.gplnature.pubgapi.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public enum SeasonState {
    @JsonProperty("closed") CLOSED,
    @JsonProperty("prepare") PREPARE,
    @JsonProperty("progress") PROGRESS,
}
