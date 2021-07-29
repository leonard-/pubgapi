package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.DamageInfo;
import com.github.gplnature.pubgapi.model.telemetry.object.GameResult;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LogPlayerKillV2 extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("dBNOId")
    private Integer dBNOId;

    @SerializedName("victimGameResult")
    private GameResult victimGameResult;

    @SerializedName("victim")
    private Character victim;

    @SerializedName("victimWeapon")
    private String victimWeapon;

    @SerializedName("victimWeaponAdditionalInfo")
    private List<String> victimWeaponAdditionalInfo;

    @SerializedName("dBNOMaker")
    private Character dBNOMaker;

    @SerializedName("dBNODamageInfo")
    private DamageInfo dBNODamageInfo;

    @SerializedName("finisher")
    private Character finisher;

    @SerializedName("finishDamageInfo")
    private DamageInfo finishDamageInfo;

    @SerializedName("killer")
    private Character killer;

    @SerializedName("killerDamageInfo")
    private DamageInfo killerDamageInfo;

    @SerializedName("assists_AccountId")
    private List<String> assistsAccountId;

    @SerializedName("teamKillers_AccountId")
    private List<String> teamKillersAccountId;

    @SerializedName("isSuicide")
    private boolean isSuicide;

    public LogPlayerKillV2() {
        super();
    }

    public Character getFinisher() {
        return finisher;
    }

    public void setFinisher(Character finisher) {
        this.finisher = finisher;
    }

    public DamageInfo getFinishDamageInfo() {
        return finishDamageInfo;
    }

    public void setFinishDamageInfo(DamageInfo finishDamageInfo) {
        this.finishDamageInfo = finishDamageInfo;
    }

    public DamageInfo getKillerDamageInfo() {
        return killerDamageInfo;
    }

    public void setKillerDamageInfo(DamageInfo killerDamageInfo) {
        this.killerDamageInfo = killerDamageInfo;
    }

    public List<String> getAssistsAccountId() {
        return assistsAccountId;
    }

    public void setAssistsAccountId(List<String> assistsAccountId) {
        this.assistsAccountId = assistsAccountId;
    }

    public List<String> getTeamKillersAccountId() {
        return teamKillersAccountId;
    }

    public void setTeamKillersAccountId(List<String> teamKillersAccountId) {
        this.teamKillersAccountId = teamKillersAccountId;
    }

    public boolean isSuicide() {
        return isSuicide;
    }

    public void setSuicide(boolean suicide) {
        isSuicide = suicide;
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Integer getDBNOId() {
        return dBNOId;
    }

    public void setDBNOId(Integer dBNOId) {
        this.dBNOId = dBNOId;
    }

    public Character getKiller() {
        return killer;
    }

    public void setKiller(Character killer) {
        this.killer = killer;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public Character getDBNOMaker() {
        return dBNOMaker;
    }

    public void setDBNOMaker(Character dBNOMaker) {
        this.dBNOMaker = dBNOMaker;
    }

    public String getVictimWeapon() {
        return victimWeapon;
    }

    public void setVictimWeapon(String victimWeapon) {
        this.victimWeapon = victimWeapon;
    }

    public List<String> getVictimWeaponAdditionalInfo() {
        return victimWeaponAdditionalInfo;
    }

    public void setVictimWeaponAdditionalInfo(List<String> victimWeaponAdditionalInfo) {
        this.victimWeaponAdditionalInfo = victimWeaponAdditionalInfo;
    }

    public GameResult getVictimGameResult() {
        return victimGameResult;
    }

    public void setVictimGameResult(GameResult victimGameResult) {
        this.victimGameResult = victimGameResult;
    }

    public DamageInfo getDBNODamageInfo() {
        return dBNODamageInfo;
    }

    public void setDBNODamageInfo(DamageInfo dBNODamageInfo) {
        this.dBNODamageInfo = dBNODamageInfo;
    }
}
