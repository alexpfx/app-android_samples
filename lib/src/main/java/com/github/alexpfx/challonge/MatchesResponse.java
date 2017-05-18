package com.github.alexpfx.challonge;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alexandre on 18/05/2017.
 */

public class MatchesResponse {


    @SerializedName("match")
    private Match match;

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }
}
