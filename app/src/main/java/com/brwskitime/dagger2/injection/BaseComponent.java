package com.brwskitime.dagger2.injection;

import com.brwskitime.dagger2.Dagger2Activity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by mmiller on 10/3/16.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface BaseComponent {
    void inject(Dagger2Activity activity);
}
