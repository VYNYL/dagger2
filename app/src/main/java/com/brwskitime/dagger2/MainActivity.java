package com.brwskitime.dagger2;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;

import com.brwskitime.dagger2.injection.AppComponent;

import javax.inject.Inject;

public class MainActivity extends Dagger2Activity {

    @Inject SharedPreferences prefs;
    @Inject Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefs.edit().putBoolean("worked",true).apply();
    }

    @Override
    public void injectActivity(AppComponent appComponent) {
        appComponent.inject(this);
    }
}
