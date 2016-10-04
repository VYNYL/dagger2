package com.brwskitime.dagger2.injection;

import android.app.Application;
import android.content.SharedPreferences;

import com.brwskitime.dagger2.Dagger2Activity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mmiller on 10/3/16.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface BaseComponent {
    Application application();
    SharedPreferences sharedPreferences();
    void inject(Dagger2Activity activity);
}
