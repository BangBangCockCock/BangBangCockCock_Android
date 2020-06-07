package com.example.bangbangcockcock_android.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bangbangcockcock_android.data.LikeData
import com.example.bangbangcockcock_android.viewholder.LikeViewHolder
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.data.Category
import com.example.bangbangcockcock_android.data.CategoryData

class LikeAdapter(private val context : Context, val datas: List<Category>) : RecyclerView.Adapter<LikeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LikeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_like, parent, false)
        return LikeViewHolder(
            view
        )
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: LikeViewHolder, position: Int) {
        holder.bind(datas[position])
        /*holder.img_watching.setOnClickListener {
            val transaction = (context as AppCompatActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.framelayout_main, ContentFragment())
            transaction.addToBackStack(null)
            transaction.commit()
        }*/
    }

}