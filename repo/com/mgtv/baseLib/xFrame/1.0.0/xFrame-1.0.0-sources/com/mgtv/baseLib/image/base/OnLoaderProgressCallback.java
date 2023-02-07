package com.mgtv.baseLib.image.base;

import androidx.annotation.Keep;

@Keep
public interface OnLoaderProgressCallback {
    /**
     *
     * @param progress  0-10000
     */
    void onProgress(int progress);
}
