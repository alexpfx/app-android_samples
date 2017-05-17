package com.github.alexpfx;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alexandre on 17/05/2017.
 */

public class Server {

    public static final String URL_STRING = "https://bracketcloud.com/api/1.0/";
    private final Endpoints mApiService;

    public Server() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(URL_STRING).addConverterFactory(
                GsonConverterFactory.create()).build();

        mApiService = retrofit.create(Endpoints.class);
    }

    public void create(Tournment tournment, Callback<Tournment> callback) {
        Call<Tournment> result = mApiService.createTournment(
                "27e0c052434c8f444b08c63576ff05a5f1adfce2", tournment);
        result.enqueue(callback);
    }

}
