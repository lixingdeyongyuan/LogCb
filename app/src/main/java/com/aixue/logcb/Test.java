package com.aixue.logcb;

import com.aixue.log.LogProxy;

public class Test extends LogProxy {

    public static LogProxy getInstance() {
        return LogProxy.getInstance(Test.class);
    }
}
