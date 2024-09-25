package com.github.gplnature.pubgapi.model.telemetry.event;

import com.github.gplnature.pubgapi.model.telemetry.object.Character;
import com.github.gplnature.pubgapi.model.telemetry.object.DamageInfo;
import com.github.gplnature.pubgapi.model.telemetry.object.GameResult;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LogPlayerKillV2 extends TelemetryEvent {

    @JsonProperty("attackId")
    private Integer attackId;

    @JsonProperty("dBNOId")
    private Integer dBNOId;

    @JsonProperty("victimGameResult")
    private GameResult victimGameResult;

    @JsonProperty("victim")
    private Character victim;

    @JsonProperty("victimWeapon")
    private String victimWeapon;

    @JsonProperty("victimWeaponAdditionalInfo")
    private List<String> victimWeaponAdditionalInfo;

    @JsonProperty("dBNOMaker")
    private Character dBNOMaker;

    @JsonProperty("dBNODamageInfo")
    private DamageInfo dBNODamageInfo;

    @JsonProperty("finisher")
    private Character finisher;

    @JsonProperty("finishDamageInfo")
    private DamageInfo finishDamageInfo;

    @JsonProperty("killer")
    private Character killer;

    @JsonProperty("killerDamageInfo")
    private DamageInfo killerDamageInfo;

    @JsonProperty("assists_AccountId")
    private List<String> assistsAccountId;

    @JsonProperty("teamKillers_AccountId")
    private List<String> teamKillersAccountId;

    @JsonProperty("isSuicide")
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
