package com.me.bs.basedemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.me.bs.basedemo.databinding.ActivityMainBinding;
import com.me.bs.basedemo.http.HttpFactory;
import com.me.bs.basedemo.http.HttpClient;
import com.me.bs.basedemo.http.HttpUtils;

import rx.Observable;

public class MainActivity extends AppCompatActivity {

    private TextView mMTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mMTv = dataBinding.tv;
        HttpUtils.getInstance().init(this.getApplicationContext(),BuildConfig.DEBUG);

        HttpClient httpClient = HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_GANKIO);
        Observable<GankIoDayBean> gankIoDay = httpClient.getGankIoDay("2018", 3 + "", 12 + "");
        mMTv.setText(gankIoDay.toString());
    }

    public void toLoginPage(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}
