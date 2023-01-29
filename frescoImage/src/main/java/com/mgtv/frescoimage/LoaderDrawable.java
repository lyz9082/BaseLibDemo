package com.mgtv.frescoimage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mgtv.baseLib.image.base.OnLoaderProgressCallback;


public class LoaderDrawable extends Drawable {
    private OnLoaderProgressCallback onLoaderProgressCallback;
    public LoaderDrawable(OnLoaderProgressCallback onLoaderProgressCallback){
        this.onLoaderProgressCallback = onLoaderProgressCallback;
    }
    @Override
    public void draw(@NonNull Canvas canvas) {

    }

    @Override
    protected boolean onLevelChange(int level) {
        if (onLoaderProgressCallback != null) {
            onLoaderProgressCallback.onProgress(level);
        }
        return true;
    }

    @Override
    public void setAlpha(int i) {

    }

    @Override
    public void setColorFilter(@Nullable ColorFilter colorFilter) {

    }

    @Override
    public int getOpacity() {
        return 0;
    }
}
