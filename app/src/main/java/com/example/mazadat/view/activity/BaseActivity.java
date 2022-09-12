package com.example.mazadat.view.activity;

import static com.example.mazadat.data.local.SharedPreferencesManger.LoadLanguage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mazadat.view.fragment.BaseFragment;

import java.util.Locale;

public class BaseActivity extends AppCompatActivity {
    public static String languageToLoad ="";

    public BaseFragment baseFragment;
//    ​

    @Override
    public void onBackPressed() {
        baseFragment.onBack();
    }
//​


    public void superBackPressed() {
        super.onBackPressed();
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        String languageCode =LoadLanguage(this,"LANGUAGE");
//        Toast.makeText(this, ""+languageCode, Toast.LENGTH_SHORT).show();

        if(languageCode!=null&&languageCode!="") {
            languageToLoad = languageCode;
//            showToast(this, languageCode+"  "+languageToLoad);
        }else if(languageToLoad == null || languageToLoad.equals("")) {
            languageToLoad = LoadLanguage(this, "LANGUAGE");
            if (languageToLoad == null || languageToLoad.isEmpty() || languageToLoad.equalsIgnoreCase("")) {
                languageToLoad = "ar";
                Locale locale = new Locale(languageToLoad);
                Locale.setDefault(locale);
                Configuration config = new Configuration();
                config.locale = locale;
                Toast.makeText(this, "onCreate: 1" + languageToLoad, Toast.LENGTH_SHORT).show();
                this.getResources().updateConfiguration(config, this.getResources().getDisplayMetrics());
            }
        }
        super.onCreate(savedInstanceState);

    }
}
