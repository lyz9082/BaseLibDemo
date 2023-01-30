package com.mgtv.baseLib.image.base;

import android.content.Context;
import android.view.View;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;


/**
 * Created by Administrator on 2017/3/22 0022.
 */
@Keep
public class XImageLoader {
    private static final XImageLoader INSTANCE = new XImageLoader();
    private IImageLoaderEngine imageLoaderStrategy;

    private XImageLoader() {
    }

    public static XImageLoader getInstance() {
        return INSTANCE;
    }

    public static ImageLoaderOptions getDefaultOptions(@NonNull View container, @NonNull String url) {
        return new ImageLoaderOptions.Builder(container, url).isCrossFade(true).build();
    }

    public static ImageLoaderOptions getDefaultOptions(@NonNull View container, @NonNull String url, LoaderResultCallBack loaderResultCallBack) {
        return new ImageLoaderOptions.Builder(container, url).isCrossFade(true).callBack(loaderResultCallBack).build();
    }

    public void showImage(@NonNull ImageLoaderOptions options) {
        if (imageLoaderStrategy != null) {
            imageLoaderStrategy.showImage(options);
        }
    }


    public void hideImage(@NonNull View view, int visiable) {
        if (imageLoaderStrategy != null) {
            imageLoaderStrategy.hideImage(view, visiable);
        }
    }

    public void cleanMemory(Context context) {
        if (imageLoaderStrategy != null) {
            imageLoaderStrategy.cleanMemory(context);
        }
    }

    public void pause(Context context) {
        if (imageLoaderStrategy != null) {
            imageLoaderStrategy.pause(context);
        }
    }

    public void resume(Context context) {
        if (imageLoaderStrategy != null) {
            imageLoaderStrategy.resume(context);
        }
    }

    // 在application的oncreate中初始化
    public void init(ImageLoaderConfig config) {
        imageLoaderStrategy = config.getIImageLoaderStrategy();
    }

    private IImageLoaderEngine getLoaderStrategy() {
        return imageLoaderStrategy;
    }

}
