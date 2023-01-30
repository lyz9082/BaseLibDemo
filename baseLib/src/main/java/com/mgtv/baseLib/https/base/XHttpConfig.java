package com.mgtv.baseLib.https.base;

import androidx.annotation.NonNull;

/**
 * @author 龙奕志
 * 创建日期：2023/1/30  2:34 PM
 * HttpConfig描述：
 */
public class XHttpConfig {
    private String cacheFilePath;//缓存地址
    private long timeout;//超时时间 单位s


    public XHttpConfig(XHttpConfig.Builder builder) {
        this.cacheFilePath = builder.cacheFilePath;
        this.timeout = builder.timeout;
    }

    public final static class Builder {
        private String cacheFilePath;//缓存地址
        private long timeout;//超时时间

        public XHttpConfig.Builder setCacheFilePath(@NonNull String cacheFilePath) {
            this.cacheFilePath = cacheFilePath;
            return this;
        }

        public XHttpConfig.Builder setTimeout(@NonNull long timeout) {
            this.timeout = timeout;
            return this;
        }


        public XHttpConfig build() {
            return new XHttpConfig(this);
        }
    }

    public String getCacheFilePath() {
        return cacheFilePath;
    }

    public long getTimeout() {
        return timeout;
    }
}

