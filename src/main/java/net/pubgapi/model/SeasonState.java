package net.pubgapi.model;

import com.google.gson.annotations.SerializedName;

public enum SeasonState {

    @SerializedName("closed") CLOSED,
    @SerializedName("prepare") PREPARE,
    @SerializedName("progress") PROGRESS,
}
