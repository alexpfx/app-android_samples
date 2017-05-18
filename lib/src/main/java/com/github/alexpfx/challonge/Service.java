package com.github.alexpfx.challonge;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
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

        @GET("tournaments/{tournament}/matches.json")
        Call<List<MatchesResponse>> getMatches(@Path("tournament") String tournament,
                @Query("api_key") String apiKey, @Query("state") String state);

        @POST("tournaments.json")
        Call<CreateTournamentResponse> createTournament(@Query("api_key") String apiKey,
                @Body Tournament tournment);

        @POST("tournaments/{tid}/participants.json")
        Call<CreateParticipantResponse> createParticipant(@Path("tid") int tournamentId,
                @Query("api_key") String apiKey,
                @Body Participant participant);

        @POST("tournaments/{tournament}/participants/bulk_add.json")
        Call<String[]> bulkAddParticipants(@Path("tournament") String tournamentId,
                @Query("api_key") String apiKey, @Body Participant[] participants);

    }


    private void setup() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        mChallonge = retrofit.create(Challonge.class);
    }


    public void createTournament(Tournament tournament,
            Callback<CreateTournamentResponse> callback) {
        Call<CreateTournamentResponse> call = mChallonge.createTournament(mApiKey, tournament);
        call.enqueue(callback);
    }

    public void bulkAddParticipants(String tournamentId, Participant[] participants,
            Callback<String[]> callback) {
        Call<String[]> call = mChallonge.bulkAddParticipants(tournamentId, mApiKey, participants);
        call.enqueue(callback);
    }

    public void createParticipant(int tid, Participant participant,
            Callback<CreateParticipantResponse> callback) {
        Call<CreateParticipantResponse> call = mChallonge.createParticipant(tid, mApiKey,
                participant);
        call.enqueue(callback);
    }

    public void getAllMatches(String tournament, String state,
            Callback<List<MatchesResponse>> callback){
        Call<List<MatchesResponse>> call = mChallonge.getMatches(tournament, mApiKey, state);
        call.enqueue(callback);
    }

}
