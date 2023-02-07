package com.mgtv.baseLib.klog;

/**
 * @Description:主要功能:
 * @Prject: CommonUtilLibrary
 * @Package: com.jingewenku.abrahamcaijin.commonutil.klog.base
 * @author: AbrahamCaiJin
 * @date: 2017年05月16日 16:56
 * @Copyright: 个人版权所有
 * @Company:
 * @version: 1.0.0
 */

import android.util.Log;
import com.mgtv.baseLib.klog.XLog;
import com.mgtv.baseLib.klog.XLogUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhaokaiqiang on 15/11/18.
 */
public class JsonLog {

    public static void printJson(String tag, String msg, String headString) {

        String message;

        try {
            if (msg.startsWith("{")) {
                JSONObject jsonObject = new JSONObject(msg);
                message = jsonObject.toString(XLog.JSON_INDENT);
            } else if (msg.startsWith("[")) {
                JSONArray jsonArray = new JSONArray(msg);
                message = jsonArray.toString(XLog.JSON_INDENT);
            } else {
                message = msg;
            }
        } catch (JSONException e) {
            message = msg;
        }

        XLogUtil.printLine(tag, true);
        message = headString + XLog.LINE_SEPARATOR + message;
        String[] lines = message.split(XLog.LINE_SEPARATOR);
        for (String line : lines) {
            Log.d(tag, "║ " + line);
        }
        XLogUtil.printLine(tag, false);
    }
}
