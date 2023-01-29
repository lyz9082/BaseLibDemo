package com.mgtv.demo;

import android.app.Application;

import com.mgtv.baseLib.global.entrance.XBuildConfig;
import com.mgtv.baseLib.global.entrance.XInitManager;
import com.mgtv.demo.httpimpl.impl.OKHttpEngine;
import com.mgtv.demo.imageimpl.impl.glidelibrary.GlideImageLoader;


public class MainApplication extends Application {
    public  static Application application;
    @Override
    public void onCreate() {
        super.onCreate();
        application=this;
        XBuildConfig xBuildConfig = new XBuildConfig.Builder()
                .setHttpEngine(new OKHttpEngine())
                .setImageLoaderStrategy(new GlideImageLoader())
                .openLog(true).build();
        XInitManager.init(this, xBuildConfig);
    }
}
