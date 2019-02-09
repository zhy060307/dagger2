package com.zhy.dagger2.multibindings;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.ElementsIntoSet;
import dagger.multibindings.IntoSet;

@Module
public class SetModuleA {

    @Provides
    @IntoSet
    public String provideOneString() {
        return "ABC";
    }

    @Provides
    @ElementsIntoSet
    public Set<String> provideSomeStrings() {
        return new HashSet<>(Arrays.asList("DEF", "GHI"));
    }

}
