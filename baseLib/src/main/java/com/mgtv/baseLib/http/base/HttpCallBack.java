package com.mgtv.baseLib.http.base;


public abstract class HttpCallBack<Result> {

    public abstract void onSuccess(Result result);

    public abstract void onFailed(String error);

}
