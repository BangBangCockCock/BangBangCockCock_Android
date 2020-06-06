package com.example.bangbangcockcock_android.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.data.LikeData

class LikeViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val iv_like = itemView.findViewById<ImageView>(R.id.iv_like)
    val title = itemView.findViewById<TextView>(R.id.title)
    val date = itemView.findViewById<TextView>(R.id.date)
    val tag = itemView.findViewById<TextView>(R.id.tag)

    fun bind(likeData : LikeData){
        Glide.with(itemView).load(likeData.iv_like).into(iv_like)
        title.text = likeData.title
        date.text = likeData.date
        tag.text = likeData.tag
    }
}

