package com.zhy.dagger2.di;

import com.zhy.dagger2.MainActivity;

//@ActivityScope
//@Component(dependencies = AppComponent.class)
public interface MainComponent {
    void inject(MainActivity activity);

}
