package com.zhy.android_dagger;

import com.zhy.android_dagger.di.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected AndroidInjector<App> applicationInjector() {
        return DaggerApplicationComponent.builder().create(this);
    }
}
