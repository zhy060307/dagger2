package com.zhy.dagger2.multibindings;

import dagger.MapKey;

//@MapKey(unwrapValue = false)
public @interface MyKey {
    String name();

    Class<?> implementingClass();

    int[] thresholds();
}
