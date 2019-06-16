package net.pubgapi.model.tournament;

import net.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import net.pubgapi.model.Links;

public class Tournament extends Entity {

    @SerializedName("relationships")
    private TournamentRelationships tournamentRelationships;
    
    private List<TournamentIncluded> included;
    private Links links;

    public Tournament() {
        super();
    }
    
    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
    
    public List<TournamentIncluded> getIncluded() {
        return included;
    }

    public TournamentRelationships getTournamentRelationships() {
        return tournamentRelationships;
    }

    public void setTournamentRelationships(TournamentRelationships tournamentRelationships) {
        this.tournamentRelationships = tournamentRelationships;
    }
}
