package com.me.bs.basedemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 作者: Panda8
 * 日期: 2018/5/9 10:39.
 */
interface RetrofitTestService {
    @GET("day/history")
    Call<GankDayHistoryBean> DayHistory();

}
