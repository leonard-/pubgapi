package com.github.gplnature.pubgapi.model.playerseason;

import com.github.gplnature.pubgapi.holders.DataHolder;
import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.generic.Entity;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.season.Season;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class PlayerSeasonRelationships {

    private DataHolder<Player> player;

    private DataListHolder<Entity> matchesSolo;

    @JsonProperty("matchesSoloFPP")
    private DataListHolder<Entity> matchesSoloFpp;

    private DataListHolder<Entity> matchesDuo;

    @JsonProperty("matchesDuoFPP")
    private DataListHolder<Entity> matchesDuoFpp;

    private DataListHolder<Entity> matchesSquad;

    @JsonProperty("matchesSquadFPP")
    private DataListHolder<Entity> matchesSquadFpp;

    private Season season;

    public PlayerSeasonRelationships() {
    }

    public Player getPlayer() {
        return player.getData();
    }

    public void setPlayer(DataHolder<Player> player) {
        this.player = player;
    }

    public List<Entity> getMatchesSolo() {
        return matchesSolo.getData();
    }

    public void setMatchesSolo(DataListHolder<Entity> matchesSolo) {
        this.matchesSolo = matchesSolo;
    }

    public List<Entity> getMatchesSoloFpp() {
        return matchesSoloFpp.getData();
    }

    public void setMatchesSoloFpp(DataListHolder<Entity> matchesSoloFpp) {
        this.matchesSoloFpp = matchesSoloFpp;
    }

    public List<Entity> getMatchesDuo() {
        return matchesDuo.getData();
    }

    public void setMatchesDuo(DataListHolder<Entity> matchesDuo) {
        this.matchesDuo = matchesDuo;
    }

    public List<Entity> getMatchesDuoFpp() {
        return matchesDuoFpp.getData();
    }

    public void setMatchesDuoFpp(DataListHolder<Entity> matchesDuoFpp) {
        this.matchesDuoFpp = matchesDuoFpp;
    }

    public List<Entity> getMatchesSquad() {
        return matchesSquad.getData();
    }

    public void setMatchesSquad(DataListHolder<Entity> matchesSquad) {
        this.matchesSquad = matchesSquad;
    }

    public List<Entity> getMatchesSquadFpp() {
        return matchesSquadFpp.getData();
    }

    public void setMatchesSquadFpp(DataListHolder<Entity> matchesSquadFpp) {
        this.matchesSquadFpp = matchesSquadFpp;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

}
