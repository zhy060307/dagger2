package com.zhy.android_dagger.di;

import javax.inject.Inject;

public class UserService {

    @Inject
    public UserService() {
    }

    public String getUserName() {
        return "zhansang";
    }
}
