package com.zhy.dagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhy.dagger2.di.DaggerMainComponent;
import com.zhy.dagger2.printer.PrintService;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    PrintService printService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .appComponent(App.component())
                .build()
                .inject(this);

    }

    public void print(View view) {
        printService.startWork();
    }

    public void testScope(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }

    public void bindInstance(View view) {
        startActivity(new Intent(this, ThirdActivity.class));
    }




}
