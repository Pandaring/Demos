package com.me.bs.basedemo.http;


import com.me.bs.basedemo.GankIoDayBean;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * @author jingbin
 * @date 16/11/21
 * 网络请求类（一个接口一个方法）
 */
public interface HttpClient {

    class Builder {
        public static HttpClient getDouBanService() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_DOUBAN);
        }

        public static HttpClient getTingServer() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_TING);
        }

        public static HttpClient getGankIOServer() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_GANKIO);
//            return HttpUtils.getInstance().getGankIOServer(HttpClient.class);
        }

        public static HttpClient getFirServer() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_FIR);
        }

        public static HttpClient getWanAndroidServer() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_WAN_ANDROID);
        }

        public static HttpClient getNHDZServer() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_NHDZ);
        }

        public static HttpClient getQSBKServer() {
            return HttpFactory.getInstance().create(HttpClient.class, HttpUtils.API_QSBK);
        }
    }

    /**
     * 每日数据： http://gank.io/api/day/年/月/日
     * eg:http://gank.io/api/day/2015/08/06
     */
    @GET("day/{year}/{month}/{day}")
    Observable<GankIoDayBean> getGankIoDay(@Path("year") String year, @Path("month") String month, @Path("day") String day);

}