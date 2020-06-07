package com.example.bangbangcockcock_android.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.data.Category
import com.example.bangbangcockcock_android.data.CategoryData
import com.example.bangbangcockcock_android.data.LikeData

class LikeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val iv_like = itemView.findViewById<ImageView>(R.id.iv_like)
    val title = itemView.findViewById<TextView>(R.id.title)
    val date = itemView.findViewById<TextView>(R.id.date)
    val tag = itemView.findViewById<TextView>(R.id.tag)

    fun bind(likeData : Category){
        Glide.with(itemView).load(likeData.concert_image).into(iv_like)

        if(likeData.concert_title.length > 5)
        {
            title.text = likeData.concert_title.slice(0..5)+"..."
        }
        else
        {
            title.text = likeData.concert_title
        }
        date.text = likeData.concert_date
        tag.text = likeData.concert_tag
    }
}

