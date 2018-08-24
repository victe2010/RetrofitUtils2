package com.victe.msit.retrofitlibrary.utils

/**
 * Created by 13526 on 2018/1/25.
 */
class RetrofitTools{
    companion object {
        private var linkUrl:String="";
        //初始化host
        fun init(linkUrl:String){
            Companion.linkUrl = linkUrl;
        }

        fun getHost():String{
            return linkUrl;
        }

    }

}