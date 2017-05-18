package com.github.alexpfx;


import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alexandre on 17/05/2017.
 */
public class ServerTest implements Callback<String> {
    CountDownLatch mCountDownLatch;
    ChallongeServer mChallongeServer;
    private void countdown() {
        mCountDownLatch.countDown();
    }

    @Before
    public void setUp() {
        mChallongeServer = new ChallongeServer();
        mCountDownLatch = new CountDownLatch(1);
    }

    @Test
    public void create() throws Exception {
        mChallongeServer.create(new ChallongeTournamentBuilder()
                .tournament_type("round robin").description("meu primeiro torneio...").name(
                        "brasileirao").ranked_by("points scored").signup_cap(
                        20).url("abcabc123teste2x1").createChallongeTournament(), this);

        mCountDownLatch.await(1, TimeUnit.MINUTES);

    }

    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        String body = response.body();
        System.out.println(body);
        System.out.println(response);
        System.out.println(response.errorBody());
        System.out.println(response.message());
        countdown();
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t);
    }
}