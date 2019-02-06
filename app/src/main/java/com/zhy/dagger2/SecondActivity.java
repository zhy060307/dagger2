package com.zhy.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhy.dagger2.di.DaggerSecondComponent;
import com.zhy.dagger2.printer.PrintService;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    @Inject
    PrintService printService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerSecondComponent.builder()
                .appComponent(App.component())
                .build()
                .inject(this);
    }

    public void testScope(View view) {
        System.out.println(printService.toString());
    }
}
