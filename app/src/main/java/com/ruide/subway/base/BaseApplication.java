package com.ruide.subway.base;

import android.app.Application;
import android.content.Context;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.orhanobut.logger.Logger;
import com.ruide.subway.network.netUtils.OkGoInit;
import com.ruide.subway.utils.LogUtils;

public  class BaseApplication  extends Application implements Thread.UncaughtExceptionHandler {


    private static BaseApplication instance;

    public synchronized static BaseApplication getInstance() {
        return instance;
    }

    private static final String TAG = "BaseApplication";

    /**
     * 返回app配置项
     */

    @Override
    public void onCreate() {
        super.onCreate();
        onAppInit();

    }

    //App进来进行的一些初始化操作
    private void onAppInit() {
        instance = this;
        //异常捕获
        OkGoInit.initOkGo(instance);
        Thread.setDefaultUncaughtExceptionHandler(this);

    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Logger.e(ex,"Exception");
        System.exit(0);

    }

}
