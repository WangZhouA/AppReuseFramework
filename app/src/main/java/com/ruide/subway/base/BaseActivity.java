package com.ruide.subway.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.ruide.subway.utils.ToastUtils;

public abstract class BaseActivity extends AppCompatActivity {

    protected final String TAG = getClass().getSimpleName();
    protected Context mContext;

    //标识是否显示对话框
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(layoutView());


    }

    protected  abstract int layoutView();

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        mContext = this;
        initView();
        initListener();
    }

    protected abstract void initView();


    protected abstract void initListener();


    protected void openActivity(Class<? extends Activity> pClass) {
        openActivity(pClass, null);
    }

    protected void openActivity(Class<? extends Activity> pClass, Bundle pBundle) {
        Intent intent = new Intent(this, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }
        startActivity(intent);
    }

    protected void openActivityForResult(Class<? extends Activity> pClass, int requestCode) {
        openActivityForResult(pClass, null, requestCode);
    }

    protected void openActivityForResult(Class<? extends Activity> pClass, Bundle pBundle, int requestCode) {
        Intent intent = new Intent(this, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }
        startActivityForResult(intent, requestCode);
    }

    /**
     * 退出Activity
     */
    public void back() {
        finish();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        ToastUtils.cancelToast();

    }

    public void toast(String msg) {
        if (mContext != null) {
            ToastUtils.showToast(mContext.getApplicationContext(), msg);
        }
    }

}
