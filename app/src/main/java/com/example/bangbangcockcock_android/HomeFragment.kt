package com.example.bangbangcockcock_android

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    private lateinit var likeAdapter: LikeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        likeAdapter = LikeAdapter(view.context)
        rv_like_home.adapter = likeAdapter
        loadLikeDatas()

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    private fun loadLikeDatas() {
        val datas = mutableListOf<LikeData>()

        datas.apply {
            add(
                LikeData(
                    iv_like = context?.getDrawable(R.drawable.img_thumbnail_mid),
                    title = "United At Home - D..",
                    tag = "#DJ",
                    date = "2020.06.07"
                )
            )
            add(
                LikeData(
                    iv_like = context?.getDrawable(R.drawable.img_thumbnail_mid),
                    title = "공연타이틀",
                    tag = "#DJ",
                    date = "2020.06.07"
                )
            )
            add(
                LikeData(
                    iv_like = context?.getDrawable(R.drawable.img_thumbnail_mid),
                    title = "United At Home - D..",
                    tag = "#DJ",
                    date = "2020.06.07"
                )
            )
        }
        likeAdapter.datas = datas
        likeAdapter.notifyDataSetChanged()
    }

}
