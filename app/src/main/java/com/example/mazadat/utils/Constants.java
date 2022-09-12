package com.example.mazadat.utils;

import android.view.Gravity;

public class Constants {

    public static final int App = 1;
    public static String BASE_URL_CONSTANT;
    public static int Nav_gravity;
    public static String ELM_BASE="https://3lm.dr-mideo.co/";
    public static int temp_courses_image;
    public static int temp_uni_image;
    public static int login_top_image;
    public static String FaceBookLink;
    public static String TelegramLink;
    public static String youtubeLink;
    public static String playStoreLink;
    public static boolean isVideoBack =true;
    public static int ImageSplash;
    public static String AUTH_TOKEN = "";


    public static String Correct = "0";
    public static String Wrong = "0";
    public static String USER_NAME = "null";
    public static int signUp = 0;
    public static int UniverstyId = -1;


    public static int currentQualty = 2994000;

    public static float currentSpeed = 1;


    public static void BaseConfig() {

        if (App == 1) {
            BASE_URL_CONSTANT = "https://dr-mideo.co/";
            Nav_gravity = Gravity.LEFT;
//            temp_courses_image = R.drawable.elm_libarary2;
//            temp_uni_image = R.drawable.elm_libarary2;
//            login_top_image = R.drawable.logintop_mideo;
            FaceBookLink = "https://www.facebook.com/Mideo.medical/?referrer=whatsapp";
            TelegramLink = "https://t.me/Mideo_App";
            youtubeLink = "https://www.youtube.com/channel/UCF8YxSqBT9LVk05u7qY2law";
            playStoreLink = "https://play.google.com/store/apps/details?id=com.codeProeLearning.codeProee3lm";
//            ImageSplash = R.mipmap.ic_mideo_luncher_round;
        } else if (App == 2) {
            BASE_URL_CONSTANT = "https://eideo.dr-mideo.co/";
            Nav_gravity = Gravity.RIGHT;

            FaceBookLink = "https://www.facebook.com/Eideo.EV";
            TelegramLink = "https://t.me/joinchat/KTrfiVHhpfe_1xhP60kwqg";
            youtubeLink = "https://www.youtube.com/channel/UCF8YxSqBT9LVk05u7qY2law";
            playStoreLink = "https://play.google.com/store/apps/details?id=com.codeProeLearning.codeProee3lm";
//            ImageSplash = R.mipmap.ic_launcher_eideo_round;
        }else {
            BASE_URL_CONSTANT = "https://3lm.dr-mideo.co/";
            Nav_gravity = Gravity.RIGHT;
//            login_top_image = R.mipmap.ic_launcher_round;
            FaceBookLink = "https://www.facebook.com/3lm.app.eg";
            TelegramLink = "https://t.me/App_3lm";
            youtubeLink = "https://www.youtube.com/channel/UCF8YxSqBT9LVk05u7qY2law";
            playStoreLink = "https://play.google.com/store/apps/details?id=com.codeProeLearning.codeProee3lm";
//            ImageSplash = R.mipmap.ic_launcher_round;
        }
    }


}
