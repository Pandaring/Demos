package com.me.bs.basedemo.http;

import static com.me.bs.basedemo.http.HttpUtils.*;

/**
 * 作者: Panda8
 * 日期: 2018/5/8 09:52.
 */

public class HttpFactory {

    private static HttpFactory instance;
    private Object gankHttps;
    private Object doubanHttps;
    private Object dongtingHttps;
    private Object firHttps;
    private Object wanAndroidHttps;
    private Object nhdzHttps;
    private Object qsbkHttps;

    public static HttpFactory getInstance() {
        if (instance == null) {
            synchronized (HttpFactory.class) {
                if (instance == null) {
                    instance = new HttpFactory();
                }
            }
        }
        return instance;
    }

    public <T> T create(Class<T> a, String type) {

        switch (type) {
            case API_GANKIO:
                if (gankHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (gankHttps == null) {
                            gankHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) gankHttps;
            case API_DOUBAN:
                if (doubanHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (doubanHttps == null) {
                            doubanHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) doubanHttps;
            case API_TING:
                if (dongtingHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (dongtingHttps == null) {
                            dongtingHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) dongtingHttps;
            case API_FIR:
                if (firHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (firHttps == null) {
                            firHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) firHttps;
            case API_WAN_ANDROID:
                if (wanAndroidHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (wanAndroidHttps == null) {
                            wanAndroidHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) wanAndroidHttps;
            case API_NHDZ:
                if (nhdzHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (nhdzHttps == null) {
                            nhdzHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) nhdzHttps;
            case API_QSBK:
                if (qsbkHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (qsbkHttps == null) {
                            qsbkHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) qsbkHttps;
            default:
                if (gankHttps == null) {
                    synchronized (HttpFactory.class) {
                        if (gankHttps == null) {
                            gankHttps = HttpUtils.getInstance().getBuilder(type).build().create(a);
                        }
                    }
                }
                return (T) gankHttps;
        }
    }

}
