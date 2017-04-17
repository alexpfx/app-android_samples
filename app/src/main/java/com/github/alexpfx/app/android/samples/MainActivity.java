package com.github.alexpfx.app.android.samples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.github.alexpfx.app.android.samples.geofances.GeofencesActivity;
import com.github.alexpfx.app.android.samples.material.MaterialDetailActivity;
import com.github.alexpfx.app.android.samples.material.MaterialMainActivity;
import com.github.alexpfx.app.android.samples.multitouch.MultiTouchActivity;
import com.github.alexpfx.app.android.samples.rxjava.RxJava;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(mToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
    }


    @OnClick(R.id.btn_multitouch)
    void multiTouch(View view) {
        Log.d(TAG, "multiTouch: ");
        startActivity(MultiTouchActivity.class);
    }



    @OnClick(R.id.btn_material)
    void material (View view){
        startActivity(MaterialDetailActivity.class);
    }

    @OnClick(R.id.btn_material_main)
    void materialMain (View view){
        startActivity(MaterialMainActivity.class);
    }

    @OnClick(R.id.btn_geofences)
    void geofences (View view){
        startActivity(GeofencesActivity.class);
    }

    @OnClick(R.id.btn_rxjava)
    void rxjava (){
        startActivity(RxJava.class);
    }
    private void startActivity(Class clazz) {
        Intent intent = new Intent(getApplicationContext(), clazz);
        startActivity(intent);
    }

}
