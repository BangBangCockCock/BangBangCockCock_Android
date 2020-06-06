package com.example.bangbangcockcock_android.data

data class responseCategory(
    val status : String,
    val success  : Boolean,
    val message : String,
    val data : List<Category>
)
data class Category(
    val concertIdx : Int,
    val concert_title: String,
    val concert_date: String,
    val concert_image : String,
    val concert_tag : String
)