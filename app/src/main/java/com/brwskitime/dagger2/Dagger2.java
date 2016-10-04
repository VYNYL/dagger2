package com.brwskitime.dagger2;

import android.app.Application;

import com.brwskitime.dagger2.injection.AppComponent;
import com.brwskitime.dagger2.injection.AppModule;
import com.brwskitime.dagger2.injection.DaggerAppComponent;


/**
 * Created by mmiller on 10/3/16.
 */

public class Dagger2 extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate()
    {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
