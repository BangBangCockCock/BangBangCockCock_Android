package com.example.bangbangcockcock_android.recent_item

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bangbangcockcock_android.R
import org.w3c.dom.Text

class RecentViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val iv_recent = itemView.findViewById<ImageView>(R.id.iv_recent)
    val title_recent = itemView.findViewById<TextView>(R.id.title_recent)
    val date_recent = itemView.findViewById<TextView>(R.id.date_recent)
    val tag_recent = itemView.findViewById<TextView>(R.id.tag_recent)

    fun bind(recentData : RecentData) {
        Glide.with(itemView).load(recentData.iv_recent).into(iv_recent)
        title_recent.text = recentData.title_recent
        date_recent.text = recentData.date_recent
        tag_recent.text = recentData.tag_recent
    }
}