package com.zhy.dagger2.multibindings;

import com.zhy.dagger2.FourthActivity;

import dagger.Component;

@Component(modules = {SetModuleA.class,
        SetModuleB.class})
public interface MultiBindingsComponent {
    void inject(FourthActivity fourthActivity);
}
