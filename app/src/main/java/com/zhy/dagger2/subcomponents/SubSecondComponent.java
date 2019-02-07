package com.zhy.dagger2.subcomponents;

import com.zhy.dagger2.SecondActivity;
import com.zhy.dagger2.scope.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent
public interface SubSecondComponent {
    @Subcomponent.Builder
    interface Builder {

        SubSecondComponent build();
    }

    void inject(SecondActivity secondActivity);
}
