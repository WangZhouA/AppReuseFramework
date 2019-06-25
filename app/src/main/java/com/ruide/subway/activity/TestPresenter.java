package com.ruide.subway.activity;

import android.content.Context;
import android.util.Log;

import com.ruide.subway.mvp.PresenterImpl;

public class TestPresenter extends PresenterImpl<TestActivity,TestMode> {
    public TestPresenter(Context context) {
        super(context);
    }

    @Override
    public TestMode initModel(Context context) {
        return new TestMode(context);
    }


    public  void  add(){
        Log.e("----->值","111");
    }
}
