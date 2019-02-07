package com.zhy.dagger2.subcomponents;

import com.zhy.dagger2.MainActivity;
import com.zhy.dagger2.scope.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface SubMainComponent {

    @Subcomponent.Builder
    interface Builder {

        SubMainComponent build();
    }

    void inject(MainActivity mainActivity);
}
