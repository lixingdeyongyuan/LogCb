package com.aixue.logcb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.aixue.log.ILogCallBack
import com.aixue.log.LogProxy

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        LogProxy.getInstance().debug("","onCreate")
//            Test().setILogCallBack(object : ILogCallBack {
//            override fun debug(tag: String?, msg: String) {
//                Log.d(tag, msg)
//            }
//
//            override fun info(tag: String?, msg: String) {
//            }
//
//            override fun error(tag: String?, msg: String) {
//            }
//
//        })
//        Test.getInstance().debug("", "haha")
//        Test.getInstance().debug("", "haha111")
//        TestHaha().setILogCallBack(object :ILogCallBack{
//            override fun debug(tag: String?, msg: String) {
//                Log.d(tag, msg)
//            }
//
//            override fun info(tag: String?, msg: String) {
//            }
//
//            override fun error(tag: String?, msg: String) {
//            }
//
//        })
//        TestHaha.getInstance().debug("","sadasd");
    }
}
