package com.example.bangbangcockcock_android.recent_item

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.like_item.LikeData

class RecentAdapter(private val context: Context) : RecyclerView.Adapter<RecentViewHolder>() {
    var datas = mutableListOf<RecentData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recent, parent, false)
        return RecentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: RecentViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}