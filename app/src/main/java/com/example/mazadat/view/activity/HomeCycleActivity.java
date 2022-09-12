package com.example.mazadat.view.activity;

import static com.example.mazadat.utils.HelperMethod.setLightStatusBar2;

import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.mazadat.R;
import com.example.mazadat.utils.ChangeMenuIcon;
import com.example.mazadat.utils.SlidingRootNavBuilder;
import com.example.mazadat.utils.TryAgainOncall;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yarolegovich.slidingrootnav.SlideGravity;
import com.yarolegovich.slidingrootnav.SlidingRootNav;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeCycleActivity extends BaseActivity implements TryAgainOncall {
    @BindView(R.id.nav_view)
    BottomNavigationView navView;
    @BindView(R.id.home_activity_card_view)
    CardView homeActivityCardView;
    CardView homeActivity2cardview;
    NavHostFragment navHostFragmentWorker;
    private NavController navController;
    float LOCATION_REFRESH_DISTANCE = 1;
    long LOCATION_REFRESH_TIME = 100;
    private Boolean isopen = false;
    LocationCallback locationCallback;
    int LOCATION_REQUEST_CODE = 10001;
    FusedLocationProviderClient fusedLocationProviderClient;
    LocationRequest locationRequest;
    SlidingRootNav slidingRootNavBuilder = null;
    private static final int REQUEST_CHECK_SETTINGS = 214;
    ChangeMenuIcon ChangeMenuIcon = null;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1234;
    TextView homeActivity2HomeTv, homeActivity2WalletTv, homeActivity2NewsTv, homeActivity2KnowMoreAboutUsTv, homeActivity2ChangeLanguageTv, homeActivity2SettingsTv, homeActivity2LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_cycle);
        ButterKnife.bind(this);
        NavHostFragment navHostFragmentWorker = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.home_activity_fragment_normal);
        navHostFragmentWorker = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.home_activity_fragment_normal);
        NavigationUI.setupWithNavController(navView, navHostFragmentWorker.getNavController());
        navController = Navigation.findNavController(this, R.id.home_activity_fragment_normal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("silding");

        setSupportActionBar(toolbar);
        if (languageToLoad.equalsIgnoreCase("ar")) {
            slidingRootNavBuilder = new SlidingRootNavBuilder(this, SlideGravity.RIGHT)
                    .withToolbarMenuToggle(toolbar).withMenuOpened(false)
                    .withMenuLayout(R.layout.activity_home_cycle2)
                    .withMenuLocked(true)
                    .inject();
        } else if (languageToLoad.equalsIgnoreCase("en")) {
            slidingRootNavBuilder = new SlidingRootNavBuilder(this, SlideGravity.LEFT)
                    .withToolbarMenuToggle(toolbar).withMenuOpened(false)
                    .withMenuLocked(true)
                    .withMenuLayout(R.layout.activity_home_cycle2)
                    .inject();
        }

        InitAndAction();
    }

    public void setTextViewColor(TextView textView) {
        homeActivity2HomeTv.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
        homeActivity2WalletTv.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
        homeActivity2NewsTv.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
        homeActivity2KnowMoreAboutUsTv.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
//        homeActivity2ChangeLanguageTv.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
        homeActivity2SettingsTv.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
//        homeActivity2LogIn.setTextColor(ContextCompat.getColor(this, R.color.white_4DFFFFFF));
        setTextViewDrawableColor(homeActivity2HomeTv,R.color.white_4DFFFFFF);
        setTextViewDrawableColor(homeActivity2WalletTv,R.color.white_4DFFFFFF);
        setTextViewDrawableColor(homeActivity2NewsTv,R.color.white_4DFFFFFF);
        setTextViewDrawableColor(homeActivity2KnowMoreAboutUsTv,R.color.white_4DFFFFFF);
        setTextViewDrawableColor(homeActivity2SettingsTv,R.color.white_4DFFFFFF);
        textView.setTextColor(ContextCompat.getColor(this, R.color.white));
    }

    private void ActionMenu(TextView textView, int navgationid) {
        homeActivity2HomeTv.setTextColor(ContextCompat.getColor(HomeCycleActivity.this, R.color.white));
        setTextViewDrawableColor(homeActivity2HomeTv,R.color.white);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(navgationid);
                textView.setTextColor(ContextCompat.getColor(HomeCycleActivity.this, R.color.white));
                setTextViewColor(textView);
                ChangeMenuIcon.changeMenuIcon(2);
                slidingRootNavBuilder.closeMenu();
                homeActivityCardView.setRadius(0f);
                homeActivityCardView.setCardElevation(0f);
                isopen = false;
            }
        });

    }


    private void InitAndAction() {
        homeActivity2HomeTv = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_home_tv);
        homeActivity2WalletTv = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_wallet_tv);
        homeActivity2NewsTv = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_news_tv);
        homeActivity2KnowMoreAboutUsTv = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_Know_more_tv);
//        homeActivity2ChangeLanguageTv = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_change_language_tv);
        homeActivity2SettingsTv = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_setting_tv);
//        homeActivity2LogIn = (TextView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity2_logout_tv);
        homeActivity2cardview = (CardView) slidingRootNavBuilder.getLayout().findViewById(R.id.home_activity_card_view);
//        ActionMenu(homeActivity2UserNameTv,R.id.homeFragment);
//        ActionMenu(homeActivity2RateTv,R.id.homeFragment);
        ActionMenu(homeActivity2HomeTv, R.id.homeFragment);
        ActionMenu(homeActivity2WalletTv, R.id.walletFragment);
        ActionMenu(homeActivity2NewsTv, R.id.newsFragment);
        ActionMenu(homeActivity2KnowMoreAboutUsTv, R.id.whoAboutUsFragment);
//        ActionMenu(homeActivity2ChangeLanguageTv, R.id.home_activity2_change_language_tv);
        ActionMenu(homeActivity2SettingsTv, R.id.moreFragment);
//        homeActivity2LogIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            }
//        });

    }


    public Boolean isMenuOpen() {
        return isopen;
    }
    public void SetToolBarHeaderBlack2(ChangeMenuIcon ChangeMenuIcon) {
        this.ChangeMenuIcon = ChangeMenuIcon;
        if (!isopen) {
            ChangeMenuIcon.changeMenuIcon(1);
            slidingRootNavBuilder.openMenu();
            homeActivityCardView.setRadius(50f);
            homeActivityCardView.setMaxCardElevation(200f);
            isopen = true;

        } else {
            ChangeMenuIcon.changeMenuIcon(2);
            slidingRootNavBuilder.closeMenu();
            homeActivityCardView.setRadius(0f);
            homeActivityCardView.setCardElevation(0f);
            isopen = false;
//
        }
    }
    public void SetToolBarHeaderBlack() {
        float scaleFactor = 4f;

//        float slideX = drawerView.getWidth() * slideOffset;
        float slidey = 150;
        navView.setTranslationY(slidey);
//                frame.setScaleX(slideOffset / scaleFactor);
        navView.setScaleY(150);
        navView.setScaleX(150);
        navView.setForegroundGravity(Gravity.END | Gravity.CENTER);
//        drawerLayout.addDrawerListener(actionBarDrawerToggle);
//        drawerLayout.setScrimColor(Color.TRANSPARENT);
//        drawerLayout.setDrawerElevation(6f);
    }

    public void SetToolBarHeaderWhiteFAFAFA() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(getResources().getColor(R.color.white_4DFFFFFF));
        }
    }

    @Override
    public void tryAgainCall(String type) {
    }

    private void getLocationPermission() {

    }


    protected void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            Configuration configuration = getResources().getConfiguration();
            configuration.setLayoutDirection(new Locale("ar"));
            getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            Locale locale = new Locale("ar");
            Locale.setDefault(locale);
            Configuration config = new Configuration();
            config.locale = locale;
            HomeCycleActivity.this.getResources().updateConfiguration(config, HomeCycleActivity.this.getResources().getDisplayMetrics());

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        setLightStatusBar2(this);
    }
    private void setTextViewDrawableColor(TextView textView, int color) {
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(textView.getContext(), color), PorterDuff.Mode.SRC_IN));
            }
        }
    }
}