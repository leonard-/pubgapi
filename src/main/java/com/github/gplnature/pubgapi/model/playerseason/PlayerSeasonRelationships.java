package com.github.gplnature.pubgapi.model.playerseason;

import com.github.gplnature.pubgapi.holders.DataHolder;
import com.github.gplnature.pubgapi.holders.DataListHolder;
import com.github.gplnature.pubgapi.model.match.Match;
import com.github.gplnature.pubgapi.model.player.Player;
import com.github.gplnature.pubgapi.model.season.Season;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PlayerSeasonRelationships {

    private DataHolder<Player> player;

    private DataListHolder<Match> matchesSolo;

    @SerializedName("matchesSoloFPP")
    private DataListHolder<Match> matchesSoloFpp;

    private DataListHolder<Match> matchesDuo;

    @SerializedName("matchesDuoFPP")
    private DataListHolder<Match> matchesDuoFpp;

    private DataListHolder<Match> matchesSquad;

    @SerializedName("matchesSquadFPP")
    private DataListHolder<Match> matchesSquadFpp;

    private Season season;

    public PlayerSeasonRelationships() {
    }

    public Player getPlayer() {
        return player.getData();
    }

    public void setPlayer(DataHolder<Player> player) {
        this.player = player;
    }

    public List<Match> getMatchesSolo() {
        return matchesSolo.getData();
    }

    public void setMatchesSolo(DataListHolder<Match> matchesSolo) {
        this.matchesSolo = matchesSolo;
    }

    public List<Match> getMatchesSoloFpp() {
        return matchesSoloFpp.getData();
    }

    public void setMatchesSoloFpp(DataListHolder<Match> matchesSoloFpp) {
        this.matchesSoloFpp = matchesSoloFpp;
    }

    public List<Match> getMatchesDuo() {
        return matchesDuo.getData();
    }

    public void setMatchesDuo(DataListHolder<Match> matchesDuo) {
        this.matchesDuo = matchesDuo;
    }

    public List<Match> getMatchesDuoFpp() {
        return matchesDuoFpp.getData();
    }

    public void setMatchesDuoFpp(DataListHolder<Match> matchesDuoFpp) {
        this.matchesDuoFpp = matchesDuoFpp;
    }

    public List<Match> getMatchesSquad() {
        return matchesSquad.getData();
    }

    public void setMatchesSquad(DataListHolder<Match> matchesSquad) {
        this.matchesSquad = matchesSquad;
    }

    public List<Match> getMatchesSquadFpp() {
        return matchesSquadFpp.getData();
    }

    public void setMatchesSquadFpp(DataListHolder<Match> matchesSquadFpp) {
        this.matchesSquadFpp = matchesSquadFpp;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

}
