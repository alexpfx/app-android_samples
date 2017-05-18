package com.github.alexpfx;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by alexandre on 17/05/2017.
 */

public class ChallongeServer {

    public static final String BASE_URL = "https://api.challonge.com/v1/";

    private final ChallongeEndpoints mEndpoints;
    public ChallongeServer() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        mEndpoints = retrofit.create(ChallongeEndpoints.class);

    }

    public void create (ChallongeTournament tournament, Callback<String> callback){
        Call<String> call = mEndpoints.createTournment("qIEyri7IhegouZ1kU56LNvtstk2AANoHUfl8LARb", tournament);
        call.enqueue(callback);
    }
}
