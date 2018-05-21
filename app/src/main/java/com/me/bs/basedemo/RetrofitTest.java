package com.me.bs.basedemo;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 作者: Panda8
 * 日期: 2018/5/9 10:24.
 */
public class RetrofitTest {

    public static void main(String args []) {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("http://gank.io/api/");
        builder.addConverterFactory(GsonConverterFactory.create());
        Retrofit build = builder.build();

        RetrofitTestService service = build.create(RetrofitTestService.class);
        Call<GankDayHistoryBean> call = service.DayHistory();
        call.enqueue(new Callback<GankDayHistoryBean>() {
            @Override
            public void onResponse(Call<GankDayHistoryBean> call, Response<GankDayHistoryBean> response) {
                GankDayHistoryBean body = response.body();

            }

            @Override
            public void onFailure(Call<GankDayHistoryBean> call, Throwable t) {

            }
        });

    }
}
