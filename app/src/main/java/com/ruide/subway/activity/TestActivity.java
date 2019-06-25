package com.ruide.subway.activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.ruide.subway.R;
import com.ruide.subway.base.BaseMVPActivity;

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
        Toast.makeText(mContext, "111", Toast.LENGTH_SHORT).show();
    }
}
