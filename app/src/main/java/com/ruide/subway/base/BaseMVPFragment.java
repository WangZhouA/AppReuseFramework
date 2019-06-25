package com.ruide.subway.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.ruide.subway.mvp.IView;
import com.ruide.subway.mvp.PresenterImpl;


/**
 * 给予MVP封装的Fragment
 */

public abstract class BaseMVPFragment<P extends PresenterImpl> extends BaseFragment implements IView {

    private P mPresenter;

    public abstract P initPresenter(Context context);

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPresenter != null){
            mPresenter.detatchView();
        }
    }

    @Override
    protected void initView() {
        mPresenter = initPresenter(getActivity());
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void initListener() {
    }

    protected P getPresenter(){
        return mPresenter;
    }
}
