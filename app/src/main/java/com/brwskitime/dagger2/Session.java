package com.brwskitime.dagger2;

import android.app.Application;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by mmiller on 10/4/16.
 */

@Singleton
public class Session {

    Application application;

    @Inject
    public Session(Application application) {
        this.application = application;
    }
}
