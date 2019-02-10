package com.zhy.dagger2.multibindings;

import com.zhy.dagger2.FourthActivity;

import java.util.Map;

import dagger.Component;

@Component(modules = {SetModuleA.class,
        SetModuleB.class,
        MapModuleA.class,
        MapModuleB.class})
public interface MultiBindingsComponent {

    void inject(FourthActivity fourthActivity);

    Map<String, Long> longsByString();

    Map<Long, String> stringsByLong();

    Map<Class<?>, String> stringsByClass();

    Map<Color, String> myEnumStringMap();

    Map<Class<? extends Number>, String> stringsByNumberClass();

//    Map<MyKey, String> myKeyStringMap();

}
