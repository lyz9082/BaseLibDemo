package com.mgtv.baseLib.reflect;

import android.text.TextUtils;

/**
 * @author 龙奕志
 * 创建日期：2023/1/30  2:29 PM
 * RelectUtil描述：
 */
public class ReflectUtil {

    public static <T> T obtainObject(String className) {
        if (!TextUtils.isEmpty(className)) {
            Class cl = null;
            try {
                cl = Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                T obj = (T) cl.newInstance();
                return obj;
            } catch (IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
