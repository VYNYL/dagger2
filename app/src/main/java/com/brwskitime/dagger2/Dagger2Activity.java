package com.brwskitime.dagger2;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

import com.brwskitime.dagger2.injection.AppModule;
import com.brwskitime.dagger2.injection.AppComponent;
import com.brwskitime.dagger2.injection.DaggerAppComponent;

import butterknife.ButterKnife;

/**
 * Created by mmiller on 10/3/16.
 */

public abstract class Dagger2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectActivity(((Dagger2)getApplication()).getAppComponent());
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        bn();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        bn();
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        bn();
    }

    private void bn() {
        ButterKnife.bind(this);
    }

    public abstract void injectActivity(AppComponent appComponent);
}
