package com.mgtv.baseLib.https.base;

import java.util.Map;

public interface IHttpEngine {

    void get(String url, Map<String, Object> params, HttpCallBack callBack);

    void post(String url, Map<String, Object> params, HttpCallBack callBack);

    /**
     * 设置配置
     */
    void setConfig(XHttpConfig xHttpConfig);

}
