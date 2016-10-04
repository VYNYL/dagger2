package com.brwskitime.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.brwskitime.dagger2.injection.AppModule;
import com.brwskitime.dagger2.injection.AppComponent;
import com.brwskitime.dagger2.injection.DaggerAppComponent;

/**
 * Created by mmiller on 10/3/16.
 */

public abstract class Dagger2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule(getApplication())).build();
        injectActivity(appComponent);
    }

    public abstract void injectActivity(AppComponent appComponent);
}
