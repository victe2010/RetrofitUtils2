package com.victe.msit.retrofitutils

import android.app.Application
import com.victe.msit.retrofitlibrary.utils.RetrofitTools
import com.victe.msit.retrofitlibrary.utils.RetrofitWrapper

class MyApplication :Application(){
   companion object {
       lateinit var service: Api;
   }

    override fun onCreate() {
        super.onCreate()
        RetrofitTools.init("http://wolf.qf5668.com");
        service = RetrofitWrapper.getInstance()!!.createCookie(Api::class.java);
    }
}