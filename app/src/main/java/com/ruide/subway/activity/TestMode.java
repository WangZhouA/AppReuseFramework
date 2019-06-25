package com.ruide.subway.activity;

import android.content.Context;

import com.ruide.subway.mvp.ModelImpl;

public class TestMode extends ModelImpl {

    public TestMode(Context context) {
        super(context);
    }

    public  String  add(){
        return "1";
    }

}
