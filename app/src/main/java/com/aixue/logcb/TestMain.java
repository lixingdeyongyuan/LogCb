package com.aixue.logcb;

import com.aixue.log.LogProxy;

public class TestMain extends LogProxy {

    public static LogProxy getInstance(){
        return getInstance(TestMain.class);
    }
}
