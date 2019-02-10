package com.zhy.dagger2.multibindings;

import com.zhy.dagger2.qualifier.MyQualifier;

import java.util.Map;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.Multibinds;

@Module
public abstract class MultibindsModule {

    @Multibinds
    abstract Set<Foo> aSet();

    @Multibinds
    @MyQualifier
    abstract Set<Foo> aQualifiedSet();

    @Multibinds
    abstract Map<String, Foo> aMap();

    @Multibinds
    @MyQualifier
    abstract Map<String, Foo> aQualifiedMap();

    @Provides
    static Object usesMultibindings(Set<Foo> set, @MyQualifier Map<String, Foo> map) {
        return "";
    }
}
