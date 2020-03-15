package com.ruide.subway.mvp;

import com.ruide.subway.bean.ErrorBean;

/**
 *
 * MVP View
 */

public interface IView {
    /**
     * show loading message
     *
     * @param msg
     */
    void showLoading(String msg);
    /**
     * hide loading
     */
    void hideLoading();
    /**
     * show business error :网络异常及数据错误等异常情况
     */
    void showBusinessError(ErrorBean error);

    void showException(ErrorBean error);

}
