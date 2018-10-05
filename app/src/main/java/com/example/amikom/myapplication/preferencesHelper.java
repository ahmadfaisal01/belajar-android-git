package com.example.amikom.myapplication;

/**
 * Created by amikom on 28/09/2018.
 */

public class preferencesHelper {
    private static PreferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;

    privste PreferencesHelper(Content content) {
        sharedPreferences = content
                .getApplicationContent()
                .getSharedPreferences("simle.android.app", context.Mode_Private);

    }
    public  static PreferencesHelper getIntance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new PreferencesHelper(context);
        }
        return INSTANCE;

    }

    public SharedPreferences Prof() {
        return SharedPreferences;
    }


    public Boolean IsiLogin() {
        return sharedPreferences.getBoolean("IsiLogin", false)
    }

    pulic void setLogin(boolean isCall) {
        sharedPreferences.edit().putBoolean("isLogin", isCall.apply();

    }
}
