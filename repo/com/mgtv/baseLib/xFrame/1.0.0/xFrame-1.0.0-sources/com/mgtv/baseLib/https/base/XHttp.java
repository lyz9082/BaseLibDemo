package com.mgtv.baseLib.https.base;

import androidx.annotation.Keep;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
@Keep
public class XHttp implements IHttpEngine {

    private static IHttpEngine httpEngine;
    private static XHttp xHttp;
    public static XHandler handler = new XHandler();

    public static void init(IHttpEngine engine) {
        httpEngine = engine;
    }

    public static XHttp obtain() {
        if (httpEngine == null) {
            throw new NullPointerException("Call XFrame.initXHttp(IHttpEngine httpEngine) within your Application onCreate() method." +
                    "Or extends XApplication");
        }
        if (xHttp == null) {
            xHttp = new XHttp();
        }
        return xHttp;
    }

    /**
     * 获取实体类的类型
     *
     * @param obj
     * @return
     */
    public static Class<?> analysisClassInfo(Object obj) {
        Type genType = obj.getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        return (Class<?>) params[0];
    }

    @Override
    public void get(String url, Map<String, Object> params, HttpCallBack callBack) {
        try {
            httpEngine.get(url, params, callBack);
        } catch (Exception e) {
            if (callBack != null) {
                callBack.onFailed("unKnowError");
            }
        }
    }

    @Override
    public void post(String url, Map<String, Object> params, HttpCallBack callBack) {
        try {
            httpEngine.post(url, params, callBack);
        } catch (Exception e) {
            if (callBack != null) {
                callBack.onFailed("unKnowError");
            }
        }
    }

    @Override
    public void setConfig(XHttpConfig xHttpConfig) {
        try {
            httpEngine.setConfig(xHttpConfig);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
