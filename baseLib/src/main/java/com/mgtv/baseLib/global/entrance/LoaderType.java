package com.mgtv.baseLib.global.entrance;

import androidx.annotation.Keep;

/**
 * @author 龙奕志
 * 创建日期：2023/1/30  9:08 AM
 * LoaderType描述：支持的动态框架类型
 */
@Keep
public class LoaderType {
    @Keep
    public enum HttpLoaderType {
        OKHTTP,VOLLEY,ASYNC
    }
    @Keep
    public enum ImageLoaderType {
        GLIDE,FRESCO
    }

}
