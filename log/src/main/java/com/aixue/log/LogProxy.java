package com.aixue.log;

import android.text.TextUtils;


/**
 * 日志代理类
 */
public class LogProxy implements ILogCallBack {

    private static LogProxy sLogProxy = null;
    public String TAG = "log";

    private ILogCallBack mILogCallBack = null;

    public static LogProxy getInstance() {
        if (sLogProxy == null) {
            throw new RuntimeException("you need to instance this class one time!");
        }
        return sLogProxy;
    }


    public LogProxy() {
        TAG = getClass().getSimpleName();
        if (sLogProxy == null) {
            sLogProxy = this;
        } else {
            throw new RuntimeException("Don't instance the class two time!");
        }

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
