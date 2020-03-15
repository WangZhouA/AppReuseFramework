package com.ruide.subway.activity;
import android.content.Context;
import android.util.Log;

import com.ruide.subway.R;
import com.ruide.subway.base.BaseMVPActivity;
import com.ruide.subway.bean.ErrorBean;
import com.ruide.subway.bean.LoginBean;
import com.ruide.subway.bean.WeatherEntity;

public class TestActivity   extends BaseMVPActivity<TestPresenter>{


    @Override
    public TestPresenter initPresenter(Context context) {
        return new TestPresenter(context) ;

    }

    @Override
    protected int layoutView() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        getPresenter().add();
    }

    @Override
    protected void initListener() {
        super.initListener();

//        HashMap<String,String> map  = new HashMap<>();
//        map.put("password","###78a5523d172736068b6b3fff7d6ad3f7");
//        map.put("device_type","android");
//        map.put("email","514077686123@qq.com");
//        OkGoUtils.getInstance().postExcute("https://api.famiguard.com/user/signin_app", map, new StrCallback() {
//            @Override
//            public void requestSuccess(String rsp) {
//
//            }
//
//            @Override
//            public void requestError(String rsp) {
//
//            }
//
//            @Override
//            public void requestCacheSuccess(String rsp) {
//
//            }
//        });
//
//
//         OkGoUtils.getInstance().getExcute("https://free-api.heweather.com/v5/weather?city=深圳&key=d4ee35112eb24b4daeddc39767d87971", new StrCallback() {
//             @Override
//             public void requestSuccess(String rsp) {
//                 Toast.makeText(mContext, "???", Toast.LENGTH_SHORT).show();
//             }
//
//             @Override
//             public void requestError(String rsp) {
//
//             }
//
//             @Override
//             public void requestCacheSuccess(String rsp) {
//
//             }
//         });

//        getPresenter().getWeather("101030100");
        getPresenter().getLogin();



    }

    public void getWeather(WeatherEntity bean) {
        Log.e("TAG", "请求成功");
//        tv_quality.setText("空气质量：" + bean.quality);
//        tv_pm.setText("Pm10" + bean.pm10);
//        tv_wendu.setText("温度：" + bean.wendu);
//        tv_notice.setText("提醒：" + bean.ganmao);
}

    public void getLogin(LoginBean bean) {
        Log.e("TAG", "请求成功deng;lu");
//        tv_quality.setText("空气质量：" + bean.quality);
//        tv_pm.setText("Pm10" + bean.pm10);
//        tv_wendu.setText("温度：" + bean.wendu);
//        tv_notice.setText("提醒：" + bean.ganmao);
}

    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showBusinessError(ErrorBean error) {

    }

    @Override
    public void showException(ErrorBean error) {

    }
}
