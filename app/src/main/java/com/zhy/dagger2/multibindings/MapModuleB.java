package com.zhy.dagger2.multibindings;

import java.math.BigDecimal;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;

@Module
public class MapModuleB {
    @Provides
    @IntoMap
    @ColorKey(Color.BLUE)
    static String provideColorValue() {
        return "value for BLUE";
    }

    @Provides
    @IntoMap
    @MyNumberClassKey(BigDecimal.class)
    static String provideBigDecimalValue() {
        return "value for BigDecimal";
    }
}


