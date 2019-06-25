package com.ruide.subway.mvp;

import android.arch.lifecycle.ViewModel;
import android.content.Context;

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

}
