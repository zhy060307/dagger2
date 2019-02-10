package com.zhy.android_dagger.di;

import com.zhy.android_dagger.MainActivity;
import com.zhy.android_dagger.scope.ActivityScope;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = {/*subcomponent需要的module*/})
    abstract MainActivity contributeMainActivity();
}
