package com.github.alexpfx.app.android.samples.multitouch;

import android.os.Bundle;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.github.alexpfx.app.android.samples.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MultiTouchActivity extends AppCompatActivity {
    private static final String TAG = "MultiTouchActivity";
    @BindView(R.id.clickable_view)
    View mView;

    public static final String prefix ="%d touch: %2f, %2f ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_touch);
        ButterKnife.bind(this);



    }



}
