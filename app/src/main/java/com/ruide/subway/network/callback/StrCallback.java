package com.ruide.subway.network.callback;

public interface StrCallback {

    void requestSuccess(String rsp);

    void requestError(String rsp);

    void requestCacheSuccess(String rsp);

}

