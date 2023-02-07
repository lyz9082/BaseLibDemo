package com.mgtv.baseLib.global.entrance;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mgtv.baseLib.BuildConfig;
import com.mgtv.baseLib.global.application.AppContext;
import com.mgtv.baseLib.https.base.IHttpEngine;
import com.mgtv.baseLib.image.base.IImageLoaderEngine;
import com.mgtv.baseLib.reflect.ReflectConstant;
import com.mgtv.baseLib.reflect.ReflectUtil;

/**
 * @author 龙奕志
 * 创建日期：2023/1/29  7:40 PM
 * XInnerBuildConfig描述：初始化配置信息有些信息不往外暴露
 */
public class XInnerBuildConfig {

    private boolean mOpenLog;//设置日志是否打开
    private IHttpEngine mHttpEngine;//设置请求框架
    private IImageLoaderEngine iImageLoaderEngine;//设置图片框架
    public static final String GLIDE = "glide";
    public static final String FRESCO = "fresco";
    public static final String OKHTTP = "okhttp";
    public static final String ASYNC = "async";
    public static final String VOLLEY = "volley";


    public XInnerBuildConfig(XInnerBuildConfig.Builder builder) {
//        this.mHttpEngine = builder.httpEngine;
//        this.iImageLoaderEngine = builder.imageLoaderEngine;
        this.mHttpEngine = obtainHttpEngine();
        this.iImageLoaderEngine =obtainImageEngine();
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


    private IHttpEngine obtainHttpEngine() {
        IHttpEngine httpEngine;
        if (VOLLEY.equalsIgnoreCase(BuildConfig.httpEngine)) {
            httpEngine = (IHttpEngine) ReflectUtil.obtainObject(AppContext.getContext(), ReflectConstant.VolleyHttpEngine);
        } else if (ASYNC.equalsIgnoreCase(BuildConfig.httpEngine)) {
            httpEngine = (IHttpEngine) ReflectUtil.obtainObject(AppContext.getContext(), ReflectConstant.AsyncHttpEngine);
        } else {
            httpEngine = (IHttpEngine) ReflectUtil.obtainObject(AppContext.getContext(), ReflectConstant.OKHttpEngine);
        }
        return httpEngine;
    }

    private IImageLoaderEngine obtainImageEngine() {
        IImageLoaderEngine imageLoaderEngine;
        if (FRESCO.equalsIgnoreCase(BuildConfig.imageEngine)) {
            imageLoaderEngine = (IImageLoaderEngine) ReflectUtil.obtainObject
                    (ReflectConstant.FrescoImageLoader);
        } else {
            imageLoaderEngine = (IImageLoaderEngine) ReflectUtil.obtainObject
                    (ReflectConstant.GlideImageLoader);
        }
        return imageLoaderEngine;
    }

    /**
     * 配合xconfig.gradle配置打包jar
     */
    public final static class Builder {
//        @Nullable
//        private IHttpEngine httpEngine;
//        @Nullable
//        private IImageLoaderEngine imageLoaderEngine;
        private boolean isOpenLog;

        //通过反射加载类，实现动态配置
//        public XInnerBuildConfig.Builder setHttpEngine(@NonNull LoaderType.HttpLoaderType httpLoaderType) {
//            if (httpLoaderType != null) {
//                if (httpLoaderType == LoaderType.HttpLoaderType.VOLLEY) {
//                    httpEngine = (IHttpEngine) ReflectUtil.obtainObject(AppContext.getContext(), ReflectConstant.VolleyHttpEngine);
//                } else if (httpLoaderType == LoaderType.HttpLoaderType.ASYNC) {
//                    httpEngine = (IHttpEngine) ReflectUtil.obtainObject(AppContext.getContext(), ReflectConstant.AsyncHttpEngine);
//                } else {
//                    httpEngine = (IHttpEngine) ReflectUtil.obtainObject(AppContext.getContext(), ReflectConstant.OKHttpEngine);
//                }
//            }
//            return this;
//        }
//
//        public XInnerBuildConfig.Builder setImageLoaderEngine(@NonNull LoaderType.ImageLoaderType imageLoaderType) {
//            if (imageLoaderType != null) {
//                if (imageLoaderType == LoaderType.ImageLoaderType.FRESCO) {
//                    imageLoaderEngine = (IImageLoaderEngine) ReflectUtil.obtainObject
//                            (ReflectConstant.FrescoImageLoader);
//                } else {
//                    imageLoaderEngine = (IImageLoaderEngine) ReflectUtil.obtainObject
//                            (ReflectConstant.GlideImageLoader);
//                }
//            }
//            return this;
//        }

        public XInnerBuildConfig.Builder openLog(boolean isOpenLog) {
            this.isOpenLog = isOpenLog;
            return this;
        }

        public XInnerBuildConfig build() {
            return new XInnerBuildConfig(this);
        }
    }

}
