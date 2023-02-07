package com.mgtv.baseLib.https.base;

import androidx.annotation.Keep;

@Keep
public abstract class HttpCallBack<Result> {

    public abstract void onSuccess(Result result);

    public abstract void onFailed(String error);

}
