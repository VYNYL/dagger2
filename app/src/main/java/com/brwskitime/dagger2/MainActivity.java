package com.brwskitime.dagger2;

import android.content.SharedPreferences;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends Dagger2Activity {

    @Inject SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Dagger2)getApplication()).getBaseComponent().inject(this);
        prefs.edit().putBoolean("worked",true).apply();
    }
}
