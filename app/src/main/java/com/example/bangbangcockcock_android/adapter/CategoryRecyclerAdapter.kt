package com.example.bangbangcockcock_android.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.data.CategoryData
import com.example.bangbangcockcock_android.viewholder.CategoryRecyclerViewHolder

class CategoryRecyclerAdapter(private val context: Context) : RecyclerView.Adapter<CategoryRecyclerViewHolder>() {
    var datas = mutableListOf<CategoryData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryRecyclerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_category_datas,parent,false)
        return CategoryRecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: CategoryRecyclerViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}