package com.example.mazadat.view.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mazadat.R;
import com.example.mazadat.view.activity.BaseActivity;
import com.example.mazadat.view.activity.HomeCycleActivity;

import org.aviran.cookiebar2.CookieBar;

import java.util.Locale;

import static com.example.mazadat.utils.HelperMethod.showCookieMsg;
import static com.example.mazadat.utils.netWork.InternetState.isConnected;
import static com.example.mazadat.view.activity.BaseActivity.languageToLoad;

public class BaseFragment extends Fragment {
    public BaseActivity baseActivity;
    public HomeCycleActivity homeCycleActivity;
    private Context activity;
    public void setUpActivity() {
        baseActivity = (BaseActivity) getActivity();
        baseActivity.baseFragment = this;
        try {
            homeCycleActivity = (HomeCycleActivity) getActivity();
        } catch (Exception e) {

        }
    }
    public void onBack() {
        baseActivity.superBackPressed();
    }
    @Override
    public void onStart() {
        super.onStart();
        setUpActivity();
    }
    public void refreshLanguage() {
        // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        activity.getResources().updateConfiguration(config,
                activity.getResources().getDisplayMetrics());
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity = context;
        if (!isConnected(getActivity())) {
            showCookieMsg("Warning", getString(R.string.error_inter_net),getActivity(), R.color.red2,
                    CookieBar.TOP);
//            onCreateErrorToast(getActivity(), getString(R.string.error_inter_net));
        }
        refreshLanguage();

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setUpActivity();
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
