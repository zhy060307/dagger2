package com.zhy.android_dagger.di;

import com.zhy.android_dagger.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainActivitySubComponent.class)
public abstract class MainModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?>
    bindYourMainActivityInjectorFactory(MainActivitySubComponent.Builder builder);
}
