package com.mgtv.baseLib.image.base;

import androidx.annotation.Keep;

@Keep
public interface LoaderResultCallBack {
    void onSuccess();
    void onFailed(String errorMsg);
}
