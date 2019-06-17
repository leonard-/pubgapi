/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pubgapi.model.tournament;

import com.google.gson.annotations.SerializedName;
import com.pubgapi.model.generic.Entity;

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
