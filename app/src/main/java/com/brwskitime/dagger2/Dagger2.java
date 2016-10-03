package com.brwskitime.dagger2;

import android.app.Application;

import com.brwskitime.dagger2.injection.AppModule;
import com.brwskitime.dagger2.injection.BaseComponent;
import com.brwskitime.dagger2.injection.DaggerBaseComponent;


/**
 * Created by mmiller on 10/3/16.
 */

public class Dagger2 extends Application {

    BaseComponent baseComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        baseComponent = DaggerBaseComponent.builder().appModule(new AppModule(this)).build();
    }

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }
}
