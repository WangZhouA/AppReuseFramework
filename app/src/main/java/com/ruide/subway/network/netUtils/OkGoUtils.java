package com.ruide.subway.network.netUtils;

import com.google.gson.Gson;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.ruide.subway.network.callback.StrCallback;
import com.ruide.subway.utils.LogUtils;

import java.util.HashMap;

public class OkGoUtils {

    private static final String TAG = "http";

    private static volatile OkGoUtils singleton;

    private OkGoUtils() {
    }

    public static OkGoUtils getInstance() {
        if (singleton == null) {
            synchronized (OkGoUtils.class) {
                if (singleton == null) {
                    singleton = new OkGoUtils();
                }
            }
        }
        return singleton;
    }

    public  void postExcute(String url, HashMap<String, String> params, final StrCallback callback) {
        LogUtils.i(TAG,new Gson().toJson(params));
        OkGo.<String>post(url)
                .isSpliceUrl(true)
                .params(params)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        LogUtils.json(TAG,response.body());
                        callback.requestSuccess( response.body());
                    }

                    @Override
                    public void onError(Response<String> response) {
                        LogUtils.json(TAG,response.body());
                        callback.requestError( response.body());
                    }

                    @Override
                    public void onCacheSuccess(Response<String> response) {
                        LogUtils.json(TAG+"缓存",response.body());
                        callback.requestCacheSuccess( response.body());
                    }
                });
    }

    public  void getExcute(String url, final StrCallback callback) {
        LogUtils.i(TAG,url);
        OkGo.<String>get(url)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        LogUtils.json(TAG,response.body());
                        callback.requestSuccess( response.body());
                    }
                    @Override
                    public void onError(Response<String> response) {
                        LogUtils.json(TAG,response.body());
                        callback.requestError( response.body());
                    }
                    @Override
                    public void onCacheSuccess(Response<String> response) {
                        LogUtils.json(TAG+"缓存",response.body());
                        callback.requestCacheSuccess( response.body());
                    }
                });
    }
}
