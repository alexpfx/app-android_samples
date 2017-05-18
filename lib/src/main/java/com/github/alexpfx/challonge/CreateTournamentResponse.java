package com.github.alexpfx.challonge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexandre on 18/05/2017.
 */

public class CreateTournamentResponse {


    @SerializedName("tournament")
    private Tournament tournament;

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
}
