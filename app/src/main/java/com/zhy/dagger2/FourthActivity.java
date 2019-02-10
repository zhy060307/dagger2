package com.zhy.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.zhy.dagger2.multibindings.ChildComponent;
import com.zhy.dagger2.multibindings.DaggerMultiBindingsComponent;
import com.zhy.dagger2.multibindings.DaggerParentComponent;
import com.zhy.dagger2.multibindings.MultiBindingsComponent;
import com.zhy.dagger2.multibindings.ParentComponent;
import com.zhy.dagger2.qualifier.MyQualifier;

import java.util.Set;

import javax.inject.Inject;

import dagger.Lazy;

public class FourthActivity extends AppCompatActivity {

    private static final String TAG = FourthActivity.class.getSimpleName();
    @Inject
    Set<String> mySet;

    @Inject
    @MyQualifier
    Lazy<Set<String>> myOnlySet;
    private MultiBindingsComponent component;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        component = DaggerMultiBindingsComponent
                .create();
        component.inject(this);


    }

    public void setBindings(View view) {
        Log.d(TAG, "Inject mySet value is" + mySet.toString());
        Log.d(TAG, "Inject myOnlySet value is" + myOnlySet.get().toString());

    }

    public void mapBindings(View view) {
        Log.d(TAG, "component.longsByString is" + component.longsByString());
        Log.d(TAG, "component.stringsByLong is" + component.stringsByLong());
        Log.d(TAG, "component.stringsByClass is" + component.stringsByClass());
        Log.d(TAG, "component.myEnumStringMap is" + component.myEnumStringMap());
        Log.d(TAG, "component.stringsByNumberClass is" + component.stringsByNumberClass());

//        component.myKeyStringMap();
    }

    public void subComponentsBindings(View view) {

        ParentComponent parentComponent = DaggerParentComponent.create();
        ChildComponent childComponent = parentComponent.childComponent();

        Log.d(TAG, " parentComponent.strings is" + parentComponent.strings());
        Log.d(TAG, " parentComponent.stringMap is" + parentComponent.stringMap());

        Log.d(TAG, " childComponent.strings is" + childComponent.strings());
        Log.d(TAG, " childComponent.stringMap is" + childComponent.stringMap());

    }

//    @AutoAnnotation
//    static MyKey createMyKey(String name, Class<?> implementingClass, int[] thresholds) {
//        return new AutoAnnotation_FourthActivity_createMyKey(name, implementingClass, thresholds);
//
//    }

}
