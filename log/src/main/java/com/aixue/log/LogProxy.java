package com.aixue.log;

import android.text.TextUtils;

import java.util.Hashtable;


/**
 * 日志代理类
 */
public class LogProxy implements ILogCallBack {

    public String TAG = "log";
    private ILogCallBack mILogCallBack = null;


    public LogProxy() {
        TAG = getClass().getSimpleName();
    }

    public void setILogCallBack(ILogCallBack iLogCallBack, String... tag) {
        mILogCallBack = iLogCallBack;
        if (tag != null && tag.length > 0) {
            TAG = tag[0];
        }
    }

    @Override
    public void debug(String tag, String msg) {
        if (mILogCallBack == null) {
            return;
        }
        mILogCallBack.debug(TextUtils.isEmpty(tag) ? TAG : tag, msg);
    }

    @Override
    public void info(String tag, String msg) {
        if (mILogCallBack == null) {
            return;
        }
        mILogCallBack.info(TextUtils.isEmpty(tag) ? TAG : tag, msg);
    }

    @Override
    public void error(String tag, String msg) {
        if (mILogCallBack == null) {
            return;
        }
        mILogCallBack.error(TextUtils.isEmpty(tag) ? TAG : tag, msg);
    }

}
