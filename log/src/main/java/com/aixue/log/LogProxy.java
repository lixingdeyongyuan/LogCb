package com.aixue.log;

import android.text.TextUtils;

import java.util.Hashtable;


/**
 * 日志代理类
 */
public class LogProxy implements ILogCallBack {

    private static Hashtable<String, LogProxy> sLogProxyHashtable = new Hashtable<>();
    public String TAG = "log";

    private ILogCallBack mILogCallBack = null;

    public static LogProxy getInstance(Class c) {
        LogProxy logProxy = sLogProxyHashtable.get(c.getSimpleName());
        if (logProxy == null) {
            throw new RuntimeException("you need to instance this class one time!");
        }
        return logProxy;
    }


    public LogProxy() {
        TAG = getClass().getSimpleName();
        if (sLogProxyHashtable.containsKey(TAG)) {
            throw new RuntimeException("Don't instance the class two time!");
        } else {
            sLogProxyHashtable.put(TAG, this);
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
