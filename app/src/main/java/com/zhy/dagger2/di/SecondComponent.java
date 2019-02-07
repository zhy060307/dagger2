package com.zhy.dagger2.di;

import com.zhy.dagger2.SecondActivity;

//@ActivityScope
//@Component(dependencies = AppComponent.class)
public interface SecondComponent {
    void inject(SecondActivity secondActivity);
}
