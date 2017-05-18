package com.github.alexpfx.challonge;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by alexandre on 18/05/2017.
 */

public class Service {

    public static final String BASE_URL = "https://api.challonge.com/v1/";
    private Challonge mChallonge;
    private String mApiKey;

    public Service(String apiKey) {
        mApiKey = apiKey;
        setup();
    }

    public interface Challonge {

        @POST("tournaments.json")
        Call<CreateTournamentResponse> createTournament(@Query("api_key") String apiKey,
                @Body Tournament tournment);

        @POST("tournaments/{tid}/participants.json")
        Call<CreateParticipantResponse> createParticipant(@Path("tid") int tournamentId,
                @Query("api_key") String apiKey,
                @Body Participant participant);

        @POST
        Call<String> bulkAddParticipants(@Path("tournament") int tournamentId,
                @Query("api_key") String apiKey, @Body Participant[] participants);

    }


    private void setup() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(
                GsonConverterFactory.create()).build();
        mChallonge = retrofit.create(Challonge.class);
    }


    public void createTournament(Tournament tournament,
            Callback<CreateTournamentResponse> callback) {
        Call<CreateTournamentResponse> call = mChallonge.createTournament(mApiKey, tournament);
        call.enqueue(callback);
    }


    public void createParticipant(int tid, Participant participant,
            Callback<CreateParticipantResponse> callback) {
        Call<CreateParticipantResponse> call = mChallonge.createParticipant(tid, mApiKey,
                participant);
        call.enqueue(callback);
    }

}
