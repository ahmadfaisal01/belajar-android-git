package com.example.amikom.myapplication;

import android.support.v7.app.AppCompaActivity;

inmport android.os.bundle;

import com.example.amikom.myapplication.

public class MainActivity extends AppCompaActivity {
    preferencesHelper inatance;

    @override
    protected void onCreate(Bundle savedInatanceState) {
        super.onCreate(savedInatanceState);
        setContentView(R.layout.activity_main);
        inatance=preferenceHelper.getInatance(getApplicationContext());
        int splasInterval=10;
        new Hadler () .poartDelayed(()--> {
                if (!instance.inlogin(() {
                    startActivity
        }
                }

                )
    }
}
