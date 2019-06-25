package com.ruide.subway.base;

import android.app.Application;
import android.content.Context;

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
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }


    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        ex.printStackTrace();
        System.exit(0);

    }

}
