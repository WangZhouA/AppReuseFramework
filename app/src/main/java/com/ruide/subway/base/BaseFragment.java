package com.ruide.subway.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import com.ruide.subway.utils.ToastUtils;

public abstract class BaseFragment extends Fragment {

    protected Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initListener();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ToastUtils.cancelToast();

    }

    protected abstract void initView();

    protected abstract void initListener();



    public void toast(String msg) {
        if(mContext != null){
            ToastUtils.showToast(mContext.getApplicationContext(), msg);
        }
    }

    protected void openActivity(Class<? extends Activity> pClass) {
        openActivity(pClass, null);
    }


    protected void openActivity(Class<? extends Activity> pClass, Bundle pBundle) {
        Intent intent = new Intent(mContext, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }
        startActivity(intent);
    }

    protected void openActivityForResult(Class<? extends Activity> pClass, int requestCode){
        openActivityForResult(pClass, null, requestCode);
    }

    protected void openActivityForResult(Class<? extends Activity> pClass, Bundle pBundle, int requestCode){
        Intent intent = new Intent(mContext, pClass);
        if(pBundle != null){
            intent.putExtras(pBundle);
        }
        startActivityForResult(intent, requestCode);
    }

}
