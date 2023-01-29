package com.mgtv.baseLib.global.entrance;

import android.app.Application;
import com.mgtv.baseLib.global.application.AppContext;
import com.mgtv.baseLib.http.base.IHttpEngine;
import com.mgtv.baseLib.http.base.XHttp;
import com.mgtv.baseLib.image.base.IImageLoaderStrategy;
import com.mgtv.baseLib.image.base.ImageLoaderConfig;
import com.mgtv.baseLib.image.base.XImageLoader;
import com.mgtv.baseLib.klog.XLog;

/**
 * @author 龙奕志
 * 创建日期：2023/1/18  5:56 PM
 * InitManager描述：基础库初始化入口
 */
public class XInitManager {

    public static void init(Application context, XBuildConfig buildConfig) {
        long startTime = System.currentTimeMillis();

        AppContext.init(context);
        if (buildConfig != null) {
            //日志
            XLog.init(buildConfig.isOpenLog());
            //图片库
            IImageLoaderStrategy imageLoaderStrategy = buildConfig.getImageLoaderStrategy();
            if (imageLoaderStrategy != null) {
                ImageLoaderConfig config = new ImageLoaderConfig
                        .Builder(imageLoaderStrategy)
                        .maxMemory(40 * 1024 * 1024L)  // 单位为Byte
                        .build();
                XImageLoader.getInstance().init(config);
            }

            //网络库
            IHttpEngine iHttpEngine = buildConfig.getHttpEngine();
            if (iHttpEngine != null) {
                XHttp.init(iHttpEngine);
            }
        }

        long endTime = System.currentTimeMillis();
        XLog.d("init cost time:" + (endTime - startTime));
    }
}
