package com.zhy.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.zhy.dagger2.multibindings.DaggerMultiBindingsComponent;
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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        DaggerMultiBindingsComponent
                .create().inject(this);

    }

    public void setBindings(View view) {
        Log.d(TAG, "Inject mySet value is" + mySet.toString());
        Log.d(TAG, "Inject myOnlySet value is" + myOnlySet.get().toString());

    }
}
