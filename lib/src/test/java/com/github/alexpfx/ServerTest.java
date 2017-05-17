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
public class ServerTest {
    CountDownLatch mCountDownLatch;
    Server mServer;
    private Callback<Tournment> callback = new Callback<Tournment>() {
        @Override
        public void onResponse(Call<Tournment> call, Response<Tournment> response) {
            System.out.println(response);
            System.out.println(response.body());
            System.out.println(response.headers());
            countdown ();
        }

        private void countdown() {
            mCountDownLatch.countDown();
        }

        @Override
        public void onFailure(Call<Tournment> call, Throwable t) {
            System.out.println(t.getMessage());
            countdown();
        }
    };

    @Before
    public void setUp (){
        mServer = new Server();
        mCountDownLatch = new CountDownLatch(1);
    }
    @Test
    public void create() throws Exception {
        Tournment tournment = new TournmentBuilder().setType("bracket").setTitle(
                "Campeonato Brasileiro").setSize(20).setFormat(1).createTournment();
        mServer.create(tournment, callback);
        mCountDownLatch.await(1, TimeUnit.MINUTES);
    }

}