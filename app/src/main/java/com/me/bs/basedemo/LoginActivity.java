package com.me.bs.basedemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.me.bs.basedemo.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        //setContentView(R.layout.activity_login);
        User user = new User("Hello", "Heel");
        viewDataBinding.setUser(user);

    }
}
