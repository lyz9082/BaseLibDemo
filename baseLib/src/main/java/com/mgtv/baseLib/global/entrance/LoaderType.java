package com.mgtv.baseLib.global.entrance;

/**
 * @author 龙奕志
 * 创建日期：2023/1/30  9:08 AM
 * LoaderType描述：支持的动态框架类型
 */
public class LoaderType {

    public enum HttpLoaderType {
        OKHTTP,VOLLEY,ASYNC
    }

    public enum ImageLoaderType {
        GLIDE,FRESCO
    }

}