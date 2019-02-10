package com.zhy.dagger2.multibindings;

import java.util.Map;
import java.util.Set;

import dagger.Subcomponent;

@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    Set<String> strings();

    Map<String, String> stringMap();
}