package com.zhy.dagger2.di;

import com.zhy.dagger2.App;
import com.zhy.dagger2.printer.PrintService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class,
        PrinterModule.class})
public interface AppComponent {

    void inject(App app);

    PrintService printService();

}
