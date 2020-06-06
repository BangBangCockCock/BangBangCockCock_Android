package com.example.bangbangcockcock_android.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.data.CalendarData
import com.example.bangbangcockcock_android.viewholder.CalendarViewHolder

class CalendarAdapter(private val context: Context) : RecyclerView.Adapter<CalendarViewHolder>() {
    var datas = mutableListOf<CalendarData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_calendar, parent, false)
        return CalendarViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}