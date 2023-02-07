package com.mgtv.baseLib.global.application;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * @Description:主要功能:初始化在application中获取context
 */

public class AppContext {
    @SuppressLint("StaticFieldLeak")
    private static Context context;

    private AppContext() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        AppContext.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }
}
