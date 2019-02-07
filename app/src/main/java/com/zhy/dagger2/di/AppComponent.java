package com.zhy.dagger2.di;

import com.zhy.dagger2.App;
import com.zhy.dagger2.subcomponents.SubMainComponent;
import com.zhy.dagger2.subcomponents.SubSecondComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, PrinterModule.class})
public interface AppComponent {

    void inject(App app);

    SubMainComponent.Builder mainBuilder();

    SubSecondComponent.Builder secondBuilder();
}
