package com.mgtv.baseLib.global.entrance;

import com.mgtv.baseLib.http.base.IHttpEngine;
import com.mgtv.baseLib.image.base.IImageLoaderStrategy;

/**
 * @author 龙奕志
 * 创建日期：2023/1/29  4:21 PM
 * LibBuildConfig描述：初始化配置信息
 */
public class XBuildConfig {
    private boolean mOpenLog;//设置日志是否打开
    private IHttpEngine mHttpEngine;//设置请求框架
    private IImageLoaderStrategy mImageLoaderStrategy;//设置图片框架

    public XBuildConfig(Builder builder) {
        this.mHttpEngine = builder.httpEngine;
        this.mImageLoaderStrategy = builder.imageLoaderStrategy;
        this.mOpenLog = builder.isOpenLog;
    }

    public final static class Builder {
        private IHttpEngine httpEngine;
        private IImageLoaderStrategy imageLoaderStrategy;
        private boolean isOpenLog;

        public Builder setHttpEngine(IHttpEngine httpEngine) {
            this.httpEngine = httpEngine;
            return this;
        }

        public Builder setImageLoaderStrategy(IImageLoaderStrategy imageLoaderStrategy) {
            this.imageLoaderStrategy = imageLoaderStrategy;
            return this;
        }

        public Builder openLog(boolean isOpenLog) {
            this.isOpenLog = isOpenLog;
            return this;
        }

        public XBuildConfig build() {
            return new XBuildConfig(this);
        }
    }

    public IHttpEngine getHttpEngine() {
        return mHttpEngine;
    }

    public IImageLoaderStrategy getImageLoaderStrategy() {
        return mImageLoaderStrategy;
    }

    public boolean isOpenLog() {
        return mOpenLog;
    }
}
