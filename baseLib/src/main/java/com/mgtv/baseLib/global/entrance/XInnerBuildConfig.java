package com.mgtv.baseLib.global.entrance;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mgtv.baseLib.global.application.AppContext;
import com.mgtv.baseLib.http.base.IHttpEngine;
import com.mgtv.baseLib.image.base.IImageLoaderEngine;
import com.mgtv.frescoimage.FrescoImageLoader;
import com.mgtv.glideimage.GlideImageLoader;
import com.mgtv.http.AsyncHttpEngine;
import com.mgtv.http.OKHttpEngine;
import com.mgtv.http.VolleyHttpEngine;

/**
 * @author 龙奕志
 * 创建日期：2023/1/29  7:40 PM
 * XInnerBuildConfig描述：初始化配置信息有些信息不往外暴露
 */
public class XInnerBuildConfig {

    private boolean mOpenLog;//设置日志是否打开
    private IHttpEngine mHttpEngine;//设置请求框架
    private IImageLoaderEngine iImageLoaderEngine;//设置图片框架

    public XInnerBuildConfig(XInnerBuildConfig.Builder builder) {
        this.mHttpEngine = builder.httpEngine;
        this.iImageLoaderEngine = builder.imageLoaderEngine;
        this.mOpenLog = builder.isOpenLog;
    }

    public IHttpEngine getHttpEngine() {
        return mHttpEngine;
    }

    public IImageLoaderEngine getImageLoaderEngine() {
        return iImageLoaderEngine;
    }

    public boolean isOpenLog() {
        return mOpenLog;
    }


    public final static class Builder {
        @Nullable
        private IHttpEngine httpEngine;
        @Nullable
        private IImageLoaderEngine imageLoaderEngine;
        private boolean isOpenLog;

        public XInnerBuildConfig.Builder setHttpEngine(@NonNull LoaderType.HttpLoaderType httpLoaderType) {
            if (httpLoaderType != null) {
                if (httpLoaderType == LoaderType.HttpLoaderType.VOLLEY) {
                    httpEngine = new VolleyHttpEngine(AppContext.getContext());
                } else if (httpLoaderType == LoaderType.HttpLoaderType.ASYNC) {
                    httpEngine = new AsyncHttpEngine();
                } else {
                    httpEngine = new OKHttpEngine(AppContext.getContext().getCacheDir());
                }
            }
            return this;
        }

        public XInnerBuildConfig.Builder setImageLoaderEngine(@NonNull LoaderType.ImageLoaderType imageLoaderType) {
            if (imageLoaderType != null) {
                if (imageLoaderType == LoaderType.ImageLoaderType.FRESCO) {
                    imageLoaderEngine = new FrescoImageLoader();
                } else {
                    imageLoaderEngine = new GlideImageLoader();
                }
            }
            return this;
        }

        public XInnerBuildConfig.Builder openLog(boolean isOpenLog) {
            this.isOpenLog = isOpenLog;
            return this;
        }

        public XInnerBuildConfig build() {
            return new XInnerBuildConfig(this);
        }
    }

}
