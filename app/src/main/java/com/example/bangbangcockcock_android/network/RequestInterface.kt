package com.example.bangbangcockcock_android.network

import com.example.bangbangcockcock_android.data.responseBanner
import com.example.bangbangcockcock_android.data.responseCategory
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface RequestInterface {

    @GET("/main/banner")
    fun getBanner() : Call<responseBanner>

    @GET("/main/filter/1")
    fun getConcert() : Call<responseCategory>

    @GET("/main/filter/2")
    fun getCorona() : Call<responseCategory>

    @GET("/main/filter/3")
    fun getFestival() : Call<responseCategory>

    @GET("/main/filter/4")
    fun getIdol() : Call<responseCategory>

    @GET("/main/filter/5")
    fun getRock() : Call<responseCategory>

}