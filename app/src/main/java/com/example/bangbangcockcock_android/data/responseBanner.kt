package com.example.bangbangcockcock_android.data

data class responseBanner(
    val status: String,
    val success : Boolean,
    val message :String,
    val data : List<Concert>
)
data class  Concert(

    val concert_title: String,
    val concert_date: String,
    val concert_img : String,
    val concert_tag : String
)