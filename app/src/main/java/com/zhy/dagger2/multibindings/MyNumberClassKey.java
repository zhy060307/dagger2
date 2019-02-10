
package com.zhy.dagger2.multibindings;

import dagger.MapKey;

@MapKey
public @interface MyNumberClassKey {
    Class<? extends Number> value();
}