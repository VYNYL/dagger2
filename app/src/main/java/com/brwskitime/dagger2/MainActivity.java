package com.brwskitime.dagger2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.brwskitime.dagger2.injection.AppComponent;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends Dagger2Activity implements View.OnClickListener {

    @Inject SharedPreferences prefs;
    @Inject Resources resources;
    @Inject Session session;

    @BindView(R.id.text) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefs.edit().putBoolean("worked",true).apply();
        textView.setOnClickListener(this);
    }

    @Override
    public void injectActivity(AppComponent appComponent) {
        appComponent.inject(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
