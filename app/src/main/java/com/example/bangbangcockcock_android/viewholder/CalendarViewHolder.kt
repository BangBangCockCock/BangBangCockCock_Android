package com.example.bangbangcockcock_android.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.data.CalendarData

class CalendarViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val iv_content = itemView.findViewById<ImageView>(R.id.iv_content)


    fun bind(calendarData : CalendarData){
        Glide.with(itemView).load(calendarData.iv_content).into(iv_content)
    }
}

