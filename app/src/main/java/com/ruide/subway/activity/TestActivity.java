package com.ruide.subway.activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.adapter.Call;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.ruide.subway.R;
import com.ruide.subway.base.BaseMVPActivity;
import com.ruide.subway.network.callback.StrCallback;
import com.ruide.subway.network.netUtils.OkGoUtils;
import com.ruide.subway.utils.LogUtils;

import java.util.HashMap;
import java.util.logging.Logger;

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

        HashMap<String,String> map  = new HashMap<>();
        map.put("password","###78a5523d172736068b6b3fff7d6ad3f7");
        map.put("device_type","android");
        map.put("email","514077686123@qq.com");
        OkGoUtils.getInstance().postExcute("https://api.famiguard.com/user/signin_app", map, new StrCallback() {
            @Override
            public void requestSuccess(String rsp) {

            }

            @Override
            public void requestError(String rsp) {

            }

            @Override
            public void requestCacheSuccess(String rsp) {

            }
        });
    }
}
