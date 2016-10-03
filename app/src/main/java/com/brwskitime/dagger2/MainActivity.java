package com.brwskitime.dagger2;

import android.os.Bundle;

public class MainActivity extends Dagger2Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
