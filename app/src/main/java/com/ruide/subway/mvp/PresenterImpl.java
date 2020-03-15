package com.ruide.subway.mvp;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.os.Handler;

import com.ruide.subway.network.RxManager;

public abstract class PresenterImpl<V extends IView, M extends IModel> implements IPresenter<V>, LifecycleObserver {

    private V mIView;
    private M mIModel;
    private Handler mHandler;
    private Context mContext;
    public RxManager rxManager;

    public PresenterImpl(Context context) {
        this.mContext = context;
        mIModel = initModel(context);
        mHandler = new Handler();
        rxManager= new RxManager();
    }

    public abstract M initModel(Context context);

    @Override
    public void attachView(V view) {
        mIView = view;

    }

    protected Handler getHandler() {
        return mHandler;
    }

    protected Context getContext() {
        return mContext;
    }

    @Override
    public void detatchView() {
        release();
    }

    private void release() {
        //Presenter层数据释放
        onRelease();
        mIView = null;
        if (mIModel != null) {
            //Model层数据释放
            mIModel = null;
        }
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
            mHandler = null;
        }
        mContext = null;
        mIModel = null;
    }

    @Override
    public void onRelease() {
    }

    public V getView() {
        return mIView;
    }

    public M getModel() {
        return mIModel;
    }



}
