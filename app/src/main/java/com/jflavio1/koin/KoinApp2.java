package com.jflavio1.koin;

import android.app.Application;

/**
 * KoinApp2
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since 10/11/17
 */
public class KoinApp2 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        KoinModulesKt.start(this);
    }
}
