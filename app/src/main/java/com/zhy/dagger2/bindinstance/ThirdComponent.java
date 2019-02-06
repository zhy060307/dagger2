package com.zhy.dagger2.bindinstance;

import com.zhy.dagger2.ThirdActivity;

import dagger.BindsInstance;
import dagger.Component;

@Component
public interface ThirdComponent {

    Login login();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder login(Login login);

        ThirdComponent build();
    }

    void inject(ThirdActivity thirdActivity);
}
