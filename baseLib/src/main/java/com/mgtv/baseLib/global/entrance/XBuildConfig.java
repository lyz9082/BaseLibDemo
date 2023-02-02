package com.mgtv.baseLib.global.entrance;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/**
 * @author 龙奕志
 * 创建日期：2023/1/29  4:21 PM
 * LibBuildConfig描述：初始化配置信息，xconfig.gradle配置网络和图片框架，不让外部选择感知了
 */
@Keep
public class XBuildConfig {

    private boolean mOpenLog;//设置日志是否打开
//    @NonNull
//    private LoaderType.HttpLoaderType httpLoaderType;
//    @NonNull
//    private LoaderType.ImageLoaderType imageLoaderType;


    public XBuildConfig(Builder builder) {
//        this.httpLoaderType = builder.httpLoaderType;
//        this.imageLoaderType = builder.imageLoaderType;
        this.mOpenLog = builder.isOpenLog;
    }
    @Keep
    public final static class Builder {
//        private LoaderType.HttpLoaderType httpLoaderType;
//        private LoaderType.ImageLoaderType imageLoaderType;
        private boolean isOpenLog;

//        public Builder setHttpLoaderType(@NonNull LoaderType.HttpLoaderType httpLoaderType) {
//            this.httpLoaderType = httpLoaderType;
//            return this;
//        }
//
//        public Builder setImageLoaderType(@NonNull LoaderType.ImageLoaderType imageLoaderType) {
//            this.imageLoaderType = imageLoaderType;
//            return this;
//        }

        public Builder openLog(boolean isOpenLog) {
            this.isOpenLog = isOpenLog;
            return this;
        }

        public XBuildConfig build() {
            return new XBuildConfig(this);
        }
    }

//    public LoaderType.HttpLoaderType getLoaderType() {
//        return httpLoaderType;
//    }
//
//    public LoaderType.ImageLoaderType getImageLoaderType() {
//        return imageLoaderType;
//    }

    public boolean isOpenLog() {
        return mOpenLog;
    }
}
