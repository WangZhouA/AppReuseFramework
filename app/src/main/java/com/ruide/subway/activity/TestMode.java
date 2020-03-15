package com.ruide.subway.activity;

import android.content.Context;

import com.ruide.subway.bean.LoginBean;
import com.ruide.subway.bean.WeatherEntity;
import com.ruide.subway.mvp.ModelImpl;
import com.ruide.subway.network.BaseHttpResponse;
import com.ruide.subway.network.JsonRequestBodyBuilder;
import com.ruide.subway.network.RetrofitManager;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class TestMode extends ModelImpl {

    public TestMode(Context context) {
        super(context);
    }

    public  String  add(){
        return "1";
    }

    public Observable<BaseHttpResponse<WeatherEntity>> getWeather(String city) {
        return RetrofitManager.getInstance().getRequestService().getWeather(city);
    }

    public Observable<BaseHttpResponse<LoginBean>> getLogin() {

// 这是 json的 形式上传
//        RequestBody requestBody = JsonRequestBodyBuilder.create()
//                .addParam("password","###78a5523d172736068b6b3fff7d6ad3f7")
//                .addParam("device_type","android")
//                .addParam("email","514077686123@qq.com").build();
//        return RetrofitManager.getInstance().getRequestService().getLogin(requestBody);

      //  这是拼接的形式  form-data
        Map<String, String> DataMap = new HashMap<String, String>();
        DataMap .put("password","###78a5523d172736068b6b3fff7d6ad3f7");
        DataMap .put("device_type","android");
        DataMap .put("email","514077686123@qq.com");
        return RetrofitManager.getInstance().getRequestService().getLoginFormData(generateRequestBody(DataMap));
    }

}
