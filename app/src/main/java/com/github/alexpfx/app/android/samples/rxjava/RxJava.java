package com.github.alexpfx.app.android.samples.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.EditText;

import com.github.alexpfx.app.android.samples.R;

import java.security.SecureRandom;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class RxJava extends AppCompatActivity {
    private static final String TAG = "RxJava";

    @BindView(R.id.edt_user)
    EditText mEdtUser;

    private SecureRandom rand = new SecureRandom();

    public Observable operadores() {
        final Observable<Integer> just = Observable.just(12);



        Observable.just(12).flatMap(new Func1<Integer, Observable<?>>() {
            @Override
            public Observable<?> call(Integer integer) {
                return just;
            }
        });

        return Observable.just(10).map(new Func1<Integer, Double>() {
            @Override
            public Double call(Integer integer) {
                return integer * rand.nextDouble();
            }
        });


    }

    public void operadores2() {
        Observable<Integer> obs1 = Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                subscriber.onNext(10);
                subscriber.onNext(20);
                subscriber.onNext(30);
                subscriber.onCompleted();
            }
        });


        Func1<Integer, Integer> func = new Func1<Integer, Integer>() {
            @Override
            public Integer call(Integer integer) {
                return integer * 2;
            }
        };


        obs1.map(func).map(func).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                Log.d(TAG, "call: "+integer);
                mEdtUser.setText(integer.toString());
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rx_java);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        operadores2();

    }


}
