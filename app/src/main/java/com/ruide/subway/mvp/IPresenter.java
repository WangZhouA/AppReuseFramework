package com.ruide.subway.mvp;

/**
 *
 * MVP Presenter
 */

public interface IPresenter<V extends IView> {

    void attachView(V view);

    void detatchView();

    void onRelease();
}
