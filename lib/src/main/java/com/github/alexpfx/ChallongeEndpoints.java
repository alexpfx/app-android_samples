package com.github.alexpfx;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by alexandre on 17/05/2017.
 */

public interface ChallongeEndpoints {
    @POST("tournaments.json")
    Call<String> createTournment (@Query("api_key") String apiKey, @Body ChallongeTournament tournament);
}
