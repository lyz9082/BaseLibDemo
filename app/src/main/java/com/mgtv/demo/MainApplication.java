package com.mgtv.demo;

import android.app.Application;
import com.mgtv.baseLib.global.entrance.LoaderType;
import com.mgtv.baseLib.global.entrance.XBuildConfig;
import com.mgtv.baseLib.global.entrance.XInitManager;


public class MainApplication extends Application {
    public static Application application;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        XBuildConfig xBuildConfig = new XBuildConfig.Builder()
//                .setHttpLoaderType(LoaderType.HttpLoaderType.OKHTTP)
//                .setImageLoaderType(LoaderType.ImageLoaderType.GLIDE)
                .openLog(true).build();

        XInitManager.init(this, xBuildConfig);
    }
}
