/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.gplnature.pubgapi.model.tournament;

import com.github.gplnature.pubgapi.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class TournamentIncluded extends Entity{
    @SerializedName("attributes")
    private TournamentAttributes tournamentAttributes;

    public TournamentAttributes getTournamentAttributes() {
        return tournamentAttributes;
    }

    public void setTournamentAttributes(TournamentAttributes tournamentAttributes) {
        this.tournamentAttributes = tournamentAttributes;
    }
    
}
