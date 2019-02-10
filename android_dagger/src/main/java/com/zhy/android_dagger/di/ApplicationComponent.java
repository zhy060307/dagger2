package com.zhy.android_dagger.di;


import com.zhy.android_dagger.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class,
        ActivityBuildersModule.class})
public interface ApplicationComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {
    }

}
