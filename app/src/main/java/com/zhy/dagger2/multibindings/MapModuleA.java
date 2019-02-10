package com.zhy.dagger2.multibindings;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LongKey;
import dagger.multibindings.StringKey;

@Module
public class MapModuleA {

    @Provides
    @IntoMap
    @StringKey("foo")
    public Long provideStringKeyValue() {
        return 100L;
    }


    @Provides
    @IntoMap
    @LongKey(200)
    public String providePrimitivesKeyValue() {
        return "value for LongKey";
    }

    @Provides
    @IntoMap
    @ClassKey(MyClassKey.class)
    public String provideClassKeyValue() {
        return "value for MyClassKey";
    }
}


