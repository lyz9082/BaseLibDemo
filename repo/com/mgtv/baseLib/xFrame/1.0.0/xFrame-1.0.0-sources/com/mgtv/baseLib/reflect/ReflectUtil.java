package com.mgtv.baseLib.reflect;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 龙奕志
 * 创建日期：2023/1/30  2:29 PM
 * RelectUtil描述：
 */
public class ReflectUtil {

    public static Object obtainObject(Context context,String className) {
        if (!TextUtils.isEmpty(className)) {
            Class cl = null;
            try {
                cl = Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                Constructor constructor = cl.getConstructor(Context.class);
                Object obj = null;
                try {
                    obj = constructor.newInstance(context);
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                return obj;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static Object obtainObject(String className) {
        if (!TextUtils.isEmpty(className)) {
            Class cl = null;
            try {
                cl = Class.forName(className);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                Constructor constructor = cl.getConstructor();
                Object obj = null;
                try {
                    obj = constructor.newInstance();
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                    e.printStackTrace();
                }
                return obj;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
