package com.zhy.android_dagger;

import android.os.Bundle;
import android.util.Log;

import com.zhy.android_dagger.di.UserService;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, userService.getUserName());
    }
}
