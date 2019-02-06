package com.zhy.dagger2;

import android.app.Application;

import com.zhy.dagger2.di.AppComponent;
import com.zhy.dagger2.di.DaggerAppComponent;

public class App extends Application {


    private static App app;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        appComponent = DaggerAppComponent
                .builder().build();
        appComponent.inject(this);
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }


    public static AppComponent component() {
        return app.getAppComponent();
    }

}
