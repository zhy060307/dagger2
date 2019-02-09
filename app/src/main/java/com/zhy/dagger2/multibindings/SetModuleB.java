package com.zhy.dagger2.multibindings;


import com.zhy.dagger2.qualifier.MyQualifier;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;

@Module
public class SetModuleB {

    @Provides
    @ElementsIntoSet
    @MyQualifier
    public Set<String> provideSpecialSomeStrings() {
        return new HashSet<>(Arrays.asList("Hello", "Dagger2"));
    }
}
