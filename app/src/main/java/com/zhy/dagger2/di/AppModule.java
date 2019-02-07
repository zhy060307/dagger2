package com.zhy.dagger2.di;

import android.content.Context;

import com.zhy.dagger2.App;
import com.zhy.dagger2.subcomponents.SubMainComponent;
import com.zhy.dagger2.subcomponents.SubSecondComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {SubMainComponent.class,
        SubSecondComponent.class})
public class AppModule {

    @Provides
    public Context provideContext(App app) {
        return app;
    }

}
