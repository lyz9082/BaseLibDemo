package com.mgtv.demo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.mgtv.baseLib.klog.XLog;
import com.mgtv.baseLib.http.base.BaseHttpParameter;
import com.mgtv.baseLib.http.base.HttpCallBack;
import com.mgtv.baseLib.http.base.XHttp;
import com.mgtv.baseLib.image.base.LoaderResultCallBack;
import com.mgtv.baseLib.image.base.XImageLoader;
import com.mgtv.demo.httptest.ConfigBean;

import java.util.UUID;

/**
 * @author 龙奕志
 * 创建日期：2023/1/28  11:14 AM
 * MainActivity描述：
 */
public class MainActivity extends AppCompatActivity {
    String httpUrl="http://ott.da.mgtv.com/ott/config";
    String imageUrl="https://tenfei05.cfp.cn/creative/vcg/veer/1600water/veer-164825979.jpg";
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testmain);
        ImageView imageView=findViewById(R.id.iv);

        XImageLoader.getInstance().showImage(XImageLoader.getDefaultOptions(imageView, imageUrl, new LoaderResultCallBack() {
            @Override
            public void onSuccess() {
                XLog.d("image-onSuccess");
            }

            @Override
            public void onFailed(String errorMsg) {
                XLog.d("image-onFailed"+errorMsg);
            }
        }));


        BaseHttpParameter baseHttpParameter=new BaseHttpParameter();
        baseHttpParameter.put("p", "{\"c\":{\"brand\":\"OPPO\",\"did\":\"ZgOOgo5MjkyOTHsOOyC0BnsODUsOBXsgewUGdnt2fDt8DrSqfHwGBoe/hw0NqpUFS3yqjkyOTI5MZgOOgg==\",\"mac\":\"48:95:07:67:6C:07\",\"mf\":\"OPPO\",\"mn\":\"PCAM00\",\"mod\":\"PCAM00\",\"os\":\"11\",\"osVerCode\":30,\"ts\":1674895503445,\"type\":100,\"version\":\"\"},\"ex\":{},\"float_ex\":4,\"ipdx\":{\"exptime\":0,\"geocode\":\"\",\"id\":\"\",\"ip\":\"\"},\"m\":{\"aid\":0,\"allowad\":110110,\"id\":0,\"p\":4820,\"ptype\":\"\",\"trigger_time\":0},\"parameter\":526512,\"realtime\":1,\"sdkversion\":\"IMGADSDK_2.3.7\",\"u\":{\"time\":0,\"vip\":0}}");
        baseHttpParameter.put("v", "");
        baseHttpParameter.put("id", UUID.randomUUID().toString());
        XHttp.obtain().post(httpUrl, null, new HttpCallBack<ConfigBean>() {
            @Override
            public void onSuccess(ConfigBean o) {
                XLog.d(o);
            }

            @Override
            public void onFailed(String error) {
                XLog.d(error);
            }
        });
    }
}
