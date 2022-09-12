package com.example.mazadat.view.activity;

import androidx.annotation.RequiresApi;

import android.os.Build;
import android.os.Bundle;

import com.example.mazadat.R;

public class SplashCycleActivity extends BaseActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_cycle);
//        replaceFragment(getSupportFragmentManager(), R.id.splash_frame, new splashFragment());


    }

    @Override
    public void onBackPressed() {


    }
}