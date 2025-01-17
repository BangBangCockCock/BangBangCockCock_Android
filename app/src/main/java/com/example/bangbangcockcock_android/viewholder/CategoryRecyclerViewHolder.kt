package com.example.bangbangcockcock_android.viewholder

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.R.drawable.btn_dday14
import com.example.bangbangcockcock_android.data.Category
import com.example.bangbangcockcock_android.data.CategoryData

class CategoryRecyclerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val title = itemView.findViewById<TextView>(R.id.tv_recycler_title)
    val tag = itemView.findViewById<TextView>(R.id.tv_recycler_tag)
    val date = itemView.findViewById<TextView>(R.id.tv_recycler_date)
    val btn = itemView.findViewById<Button>(R.id.btn_recycler_tag)
    val img = itemView.findViewById<ImageView>(R.id.img_recycler_datas)

    fun bind(Data: Category)
    {
        Glide.with(itemView).load(Data.concert_image).into(img)
        title.text = Data.concert_title
        tag.text = Data.concert_tag
        date.text = Data.concert_date
//        if(Data.dday.toString().equals("D-7"))
//        {
//            btn.setBackgroundColor(R.drawable.btn_dday)
//        }
//        else
//        {
//            btn.setBackgroundColor(R.drawable.btn_dday14)
//        }

        btn.text = "D-7"

    }
}