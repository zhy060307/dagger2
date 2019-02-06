package com.zhy.dagger2.di;

import com.zhy.dagger2.MainActivity;
import com.zhy.dagger2.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);

}
