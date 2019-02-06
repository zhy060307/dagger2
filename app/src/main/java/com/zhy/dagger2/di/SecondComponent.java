package com.zhy.dagger2.di;

import com.zhy.dagger2.SecondActivity;
import com.zhy.dagger2.scope.ActivityScope;

import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface SecondComponent {
    void inject(SecondActivity secondActivity);
}
