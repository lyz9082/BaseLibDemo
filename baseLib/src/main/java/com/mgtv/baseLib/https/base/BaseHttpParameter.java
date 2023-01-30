package com.mgtv.baseLib.https.base;

import android.text.TextUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 龙奕志
 * 创建日期：2023/1/28  4:41 PM
 * BaseParameter描述：
 */
public class BaseHttpParameter extends HashMap<String, String> {
    private String mParamString;

    public BaseHttpParameter() {
    }

    public BaseHttpParameter combineParams() {
        return this;
    }

    public String put(String key, Object obj) {
        return obj != null ? (String)this.put(key, obj.toString()) : "";
    }

    public String buildParameter() {
        if (TextUtils.isEmpty(this.mParamString)) {
            StringBuffer sb = new StringBuffer();
            Iterator iter = this.entrySet().iterator();

            while(iter.hasNext()) {
                try {
                    Entry<String, String> entry = (Map.Entry)iter.next();
                    Object key = entry.getKey();
                    Object val = entry.getValue();
                    if (val == null) {
                        val = "";
                    }

                    sb.append(key.toString());
                    sb.append("=");
                    if (val != null) {
                        sb.append(URLEncoder.encode(val.toString(), "UTF-8"));
                    }

                    if (iter.hasNext()) {
                        sb.append("&");
                    }
                } catch (UnsupportedEncodingException var6) {
                    var6.printStackTrace();
                }
            }

            this.mParamString = sb.toString();
        }

        return this.mParamString;
    }
}
