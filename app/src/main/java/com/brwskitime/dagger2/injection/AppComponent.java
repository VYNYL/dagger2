package com.brwskitime.dagger2.injection;

import android.content.SharedPreferences;
import android.content.res.Resources;

import com.brwskitime.dagger2.MainActivity;
import com.brwskitime.dagger2.Session;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mmiller on 10/3/16.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    SharedPreferences sharedPreferences();
    Resources resources();
    Session session();
    void inject(MainActivity activity);
}
