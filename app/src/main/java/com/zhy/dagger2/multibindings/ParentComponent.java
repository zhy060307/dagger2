package com.zhy.dagger2.multibindings;

import java.util.Map;
import java.util.Set;

import dagger.Component;

@Component(modules = ParentModule.class)
public interface ParentComponent {

    Set<String> strings();

    Map<String, String> stringMap();

    ChildComponent childComponent();
}