package com.example.bangbangcockcock_android.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestToServer {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://3.34.151.159:3000") .addConverterFactory(GsonConverterFactory.create()) .build()
    var service: RequestInterface = retrofit.create(RequestInterface::class.java)
}