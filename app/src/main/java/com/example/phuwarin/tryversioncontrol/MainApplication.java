package com.example.phuwarin.tryversioncontrol;

import android.app.Application;

import com.example.phuwarin.tryversioncontrol.manager.Contextor;

/**
 * Created by Phuwarin on 4/4/2017.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
    }
}
