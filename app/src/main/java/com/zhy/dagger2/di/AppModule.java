package com.zhy.dagger2.di;

import android.content.Context;

import com.zhy.dagger2.App;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public Context provideContext(App app) {
        return app;
    }

}
