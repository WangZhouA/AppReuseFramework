package com.ruide.subway.activity;

import android.content.Context;
import android.util.Log;

import com.ruide.subway.base.RxObserverListener;
import com.ruide.subway.bean.LoginBean;
import com.ruide.subway.bean.WeatherEntity;
import com.ruide.subway.mvp.PresenterImpl;
import com.ruide.subway.network.RetrofitManager;

public class TestPresenter extends PresenterImpl<TestActivity,TestMode> {
    public TestPresenter(Context context) {
        super(context);
    }

    @Override
    public TestMode initModel(Context context) {
        return new TestMode(context);
    }


    public  void  add(){
    }


    public void getWeather(String city_code) {
        rxManager.addObserver(RetrofitManager.getInstance().doRequest(getModel().getWeather(city_code), new RxObserverListener<WeatherEntity>(getView()) {
            @Override
            public void onSuccess(WeatherEntity result) {
                getView().getWeather(result);
            }
        }));
    }


    public  void  getLogin(){
        rxManager.addObserver(RetrofitManager.getInstance().doRequest(getModel().getLogin(), new RxObserverListener<LoginBean>(getView()) {
            @Override
            public void onSuccess(LoginBean result) {
                getView().getLogin(result);
            }
        }));
    }

}
