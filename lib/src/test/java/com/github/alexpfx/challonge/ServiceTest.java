package com.github.alexpfx.challonge;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alexandre on 18/05/2017.
 */
public class ServiceTest implements Callback<CreateTournamentResponse> {
    Service mService;
    private Random mRandom = new Random();
    CountDownLatch mCountDownLatch;
    private int mId;

    @Before
    public void setUp() {
        mCountDownLatch = new CountDownLatch(2);
        mService = new Service("");
    }

    @Test
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