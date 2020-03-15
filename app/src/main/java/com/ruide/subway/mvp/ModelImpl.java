package com.ruide.subway.mvp;

import android.arch.lifecycle.ViewModel;
import android.content.Context;

import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/**
 * Model层封装，后续会封装一些数据访问的工具类在其中，方便数据层去访问数据
 */
public class ModelImpl extends ViewModel implements IModel {

    private Context mContext;
    public ModelImpl(Context context) {
        mContext = context;
    }

    protected Context getContext() {
        return mContext;
    }


    public static Map<String, RequestBody> generateRequestBody(Map<String, String> requestDataMap) {
        Map<String, RequestBody> requestBodyMap = new HashMap<>();
        for (String key : requestDataMap.keySet()) {
            RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"),
                    requestDataMap.get(key) == null ? "" : requestDataMap.get(key));
            requestBodyMap.put(key, requestBody);
        }
        return requestBodyMap;
    }

}
