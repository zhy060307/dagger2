package com.zhy.android_dagger.di;


import com.zhy.android_dagger.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class,
        ActivityBuildersModule.class})
public interface ApplicationComponent {
    void inject(App app);
}
