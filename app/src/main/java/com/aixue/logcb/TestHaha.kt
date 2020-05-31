package com.aixue.logcb

import com.aixue.log.LogProxy

class TestHaha : LogProxy() {

    companion object {
        @JvmStatic
        fun getInstance(): LogProxy {
            return getInstance(TestHaha::class.java)
        }
    }

}