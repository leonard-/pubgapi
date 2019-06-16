package net.pubgapi.model.playerseason;

import net.pubgapi.model.match.Match;
import net.pubgapi.model.player.Player;
import net.pubgapi.model.season.Season;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class PlayerSeasonRelationships {

    private Player player;

    private Match matchesSolo;

    @SerializedName("matchesSoloFPP")
    private List<Match> matchesSoloFpp;

    private List<Match> matchesDuo;

    @SerializedName("matchesDuoFPP")
    private List<Match> matchesDuoFpp;

    private List<Match> matchesSquad;

    @SerializedName("matchesSquadFPP")
    private List<Match> matchesSquadFpp;

    private Season season;

    public PlayerSeasonRelationships() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Match getMatchesSolo() {
        return matchesSolo;
    }

    public void setMatchesSolo(Match matchesSolo) {
        this.matchesSolo = matchesSolo;
    }

    public List<Match> getMatchesSoloFpp() {
        return matchesSoloFpp;
    }

    public void setMatchesSoloFpp(List<Match> matchesSoloFpp) {
        this.matchesSoloFpp = matchesSoloFpp;
    }

    public List<Match> getMatchesDuo() {
        return matchesDuo;
    }

    public void setMatchesDuo(List<Match> matchesDuo) {
        this.matchesDuo = matchesDuo;
    }

    public List<Match> getMatchesDuoFpp() {
        return matchesDuoFpp;
    }

    public void setMatchesDuoFpp(List<Match> matchesDuoFpp) {
        this.matchesDuoFpp = matchesDuoFpp;
    }

    public List<Match> getMatchesSquad() {
        return matchesSquad;
    }

    public void setMatchesSquad(List<Match> matchesSquad) {
        this.matchesSquad = matchesSquad;
    }

    public List<Match> getMatchesSquadFpp() {
        return matchesSquadFpp;
    }

    public void setMatchesSquadFpp(List<Match> matchesSquadFpp) {
        this.matchesSquadFpp = matchesSquadFpp;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

}
