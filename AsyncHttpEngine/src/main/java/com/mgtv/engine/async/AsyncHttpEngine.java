package com.mgtv.async;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Keep;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.mgtv.baseLib.https.base.XHttpConfig;
import com.mgtv.baseLib.jsonparse.JsonUtils;
import com.mgtv.baseLib.https.base.HttpCallBack;
import com.mgtv.baseLib.https.base.IHttpEngine;
import com.mgtv.baseLib.https.base.XHttp;

import java.util.Map;

import cz.msebera.android.httpclient.Header;

/**
 * AsyncHttp简单实现，你可修改，这只是案例
 */
@Keep
public class AsyncHttpEngine implements IHttpEngine {
    private AsyncHttpClient client;

    public AsyncHttpEngine(Context context) {
        Log.i("init","AsyncHttpEngine");
        client = new AsyncHttpClient();
    }

    @Override
    public void get(String url, Map<String, Object> params, final HttpCallBack callBack) {
        RequestParams requestParams = new RequestParams();
        if(null!=params) {
            for (String key : params.keySet()) {
                requestParams.put(key, params.get(key));
            }
        }
        client.get(url, requestParams, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String result=new String(responseBody);
                Class<?> cls= XHttp.analysisClassInfo(callBack);
                //我这里使用的是fastjson，你也可以用gson，jackjson等
//                callBack.onSuccess(JSON.parseObject(result,cls));
                callBack.onSuccess(JsonUtils.fromJson(result,cls));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                callBack.onFailed(error.toString());
            }
        });
    }

    @Override
    public void post(String url, Map<String, Object> params, final HttpCallBack callBack) {
        RequestParams requestParams = new RequestParams();
        if(null!=params) {
            for (String key : params.keySet()) {
                requestParams.put(key, params.get(key));
            }
        }
        client.post(url, requestParams, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                String result=new String(responseBody);
                Class<?> cls= XHttp.analysisClassInfo(callBack);
                //我这里使用的是fastjson，你也可以用gson，jackjson等
                callBack.onSuccess(JsonUtils.fromJson(result,cls));
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                callBack.onFailed(error.toString());
            }
        });
    }

    @Override
    public void setConfig(XHttpConfig xHttpConfig) {

    }
}
