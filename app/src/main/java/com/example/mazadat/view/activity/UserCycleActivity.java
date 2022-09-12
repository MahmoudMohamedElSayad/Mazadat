package com.example.mazadat.view.activity;

import android.os.Bundle;

import com.example.mazadat.R;
import com.example.mazadat.view.fragment.userCycle.LoginFragment;

import static com.example.mazadat.utils.HelperMethod.replaceFragment;

public class UserCycleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_cycle);
        replaceFragment(getSupportFragmentManager(), R.id.user_frame, new LoginFragment());
    }


}