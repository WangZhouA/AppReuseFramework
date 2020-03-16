package com.ruide.subway.activity;

import android.content.Context;

import com.ruide.subway.bean.LoginBean;
import com.ruide.subway.bean.WeatherEntity;
import com.ruide.subway.mvp.ModelImpl;
import com.ruide.subway.network.BaseHttpResponse;
import com.ruide.subway.network.RetrofitManager;
import com.ruide.subway.network.NetRequestManger;

import io.reactivex.Observable;

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
        return NetRequestManger.instance().login("###78a5523d172736068b6b3fff7d6ad3f7","android","514077686123@qq.com");
    }

}
