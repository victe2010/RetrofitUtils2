package com.victe.msit.retrofitutils

import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*


/**
 * Created by 13526 on 2018/1/23.
 */
interface Api {
    //"static/update/app.json"
//    @HTTP(method = "GET", path = "static/update/app.json", hasBody = false)
//    fun getConfigInfo(): Call<String>

//    @GET("api/sf-login")
//    fun getConfigBean(): Call<MainBean>

    //map提交
    @POST("api/sf-login")
    @FormUrlEncoded
    fun login(@FieldMap args: HashMap<String, String>): Call<String>

    //登录跳转
    @POST("yx/u/login")
    fun startLog(): Call<String>

    //获取用户信息
    @POST("api/webajax/init-page")
    fun getUserInfo(): Call<String>

    @Headers("Content-Type:application/json","Accept: application/json")//json格式传输
    @POST("yx/u/api/xjw-lottery/init-game-lottery")
    fun initGameLotter(@Body args: HashMap<String, String>): Call<String>

    //下载文件
    @GET
    fun downFile(@Url url:String):Call<ResponseBody>

     //上传文件
    @Multipart
    @POST
    fun uploadFile(@Url url:String,@Part file:MultipartBody.Part):Call<String>

    @Headers("Content-Type:application/json","Accept: application/json")//json格式传输
    @POST("api/0/page/member/userlogin")
    fun loginUrl(@Body args: HashMap<String, String>): Call<String>


}