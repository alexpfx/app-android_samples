package com.github.alexpfx.challonge;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alexandre on 18/05/2017.
 */
public class ServiceTest implements Callback<CreateTournamentResponse> {
    private final String api_key =
            "";
    Service mService;
    private Random mRandom = new Random();
    CountDownLatch mCountDownLatch;
    private int mId;

    @Before
    public void setUp() {
        mCountDownLatch = new CountDownLatch(1);
        mService = new Service(api_key);
    }


    @Test
    public void getAllMatches () throws InterruptedException {
        mService.getAllMatches("campeonato_8147", "all", new Callback<List<MatchesResponse>>() {
            @Override
            public void onResponse(Call<List<MatchesResponse>> call,
                    Response<List<MatchesResponse>> response) {
                System.out.println(response);
                for (MatchesResponse matchesResponse : response.body()) {
                    System.out.println(matchesResponse.getMatch());
                }
                mCountDownLatch.countDown();

            }

            @Override
            public void onFailure(Call<List<MatchesResponse>> call, Throwable t) {
                mCountDownLatch.countDown();
                System.out.println(t);
            }
        });
        mCountDownLatch.await();
    }

    public void bulkAddParticipants() throws Exception {
        Participant[] participants = new Participant[19];
        for (int i = 0; i < 4 ; i++){
            participants [i] = (Participant.newBuilder().name("p" + i).active(true).seed(1+i).build());
        }

        mService.bulkAddParticipants("campeonato_1116", participants, new Callback<String[]>() {
            @Override
            public void onResponse(Call<String[]> call, Response<String[]> response) {

                System.out.println(response.message());
                System.out.println(response.raw());
                System.out.println(response.body().length);
                for (String s : response.body()) {
                    System.out.println(s);
                }
                mCountDownLatch.countDown();
            }

            @Override
            public void onFailure(Call<String[]> call, Throwable t) {
                System.out.println(t);
            }
        });
        mCountDownLatch.await();
    }

    public void createTournament() throws Exception {
        int randomNumber = mRandom.nextInt(10000);
        Tournament.Builder builder = Tournament.newBuilder()
                .name("Copa do Brasil")
                .tournamentType("round robin")
                .url("campeonato_" + randomNumber)
                .description("campeonato brasileiro de futebol, serie a")
                .rankedBy("points scored")
                .signupCap(20);

        mService.createTournament(builder.build(),
                this);


        mCountDownLatch.await();

    }

    @Override
    public void onResponse(Call<CreateTournamentResponse> call,
            Response<CreateTournamentResponse> response) {
        mId = response.body().getTournament().getId();
        mCountDownLatch.countDown();


        mService.createParticipant(mId, Participant.newBuilder()
                        .active(true)
                        .name("Grêmio")
                        .seed(1)
                        .build(),
                new Callback<CreateParticipantResponse>() {
                    @Override
                    public void onResponse(Call<CreateParticipantResponse> call,
                            Response<CreateParticipantResponse> response) {
                        System.out.println(response.headers());
                        System.out.println(response.body());
                        mCountDownLatch.countDown();
                    }

                    @Override
                    public void onFailure(Call<CreateParticipantResponse> call, Throwable t) {
                        mCountDownLatch.countDown();
                    }
                });


    }

    @Override
    public void onFailure(Call<CreateTournamentResponse> call, Throwable t) {
        mCountDownLatch.countDown();
    }
}