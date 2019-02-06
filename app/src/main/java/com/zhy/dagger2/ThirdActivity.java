package com.zhy.dagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zhy.dagger2.bindinstance.DaggerThirdComponent;
import com.zhy.dagger2.bindinstance.Login;
import com.zhy.dagger2.bindinstance.ThirdComponent;

public class ThirdActivity extends AppCompatActivity {

    private ThirdComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        component = DaggerThirdComponent.builder()
                .login(new Login("zhangsan", "lisi"))
                .build();
        component
                .inject(this);


    }

    public void login(View view) {
        TextView tvMsg = findViewById(R.id.tv_msg);
        Login login = component.login();
        tvMsg.setText(String.format("%s %s login success.", login.getUsername(), login.getPassword()));
    }
}
