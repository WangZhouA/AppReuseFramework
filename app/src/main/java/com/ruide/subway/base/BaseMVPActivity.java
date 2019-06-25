package com.ruide.subway.base;

import android.content.Context;
import android.os.Bundle;
import com.ruide.subway.mvp.IView;
import com.ruide.subway.mvp.PresenterImpl;


public abstract class BaseMVPActivity<P extends PresenterImpl> extends BaseActivity implements IView {

    private P mPresenter;
    @Override
    protected void initView() {
        mPresenter = initPresenter(this);
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void initListener() {

    }

    /**初始化Presenter*/
    public abstract P initPresenter(Context context);

    protected P getPresenter(){
        return mPresenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter != null){
            mPresenter.detatchView();
            mPresenter = null;
        }
    }
}
