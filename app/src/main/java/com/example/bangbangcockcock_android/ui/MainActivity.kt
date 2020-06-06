package com.example.bangbangcockcock_android.ui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import com.bumptech.glide.Glide
import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.adapter.MainTabAdapter
import com.example.bangbangcockcock_android.data.responseBanner
import com.example.bangbangcockcock_android.network.RequestToServer
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val requestToServer=RequestToServer
        requestToServer.service.getBanner().enqueue(
            object : Callback<responseBanner> {
                override fun onFailure(call: Call<responseBanner>, t: Throwable) {
                    Log.d("통신실패", "${t}")
                }

                override fun onResponse(
                    call: Call<responseBanner>,
                    response: Response<responseBanner>
                ) {
                    if (response.isSuccessful) {


                        tv_tag.text =   response.body()!!.data.get(0).concert_tag
                        textView_date.text =  response.body()!!.data.get(0).concert_date
                        btn_dday.text = "D-9"
                        Glide.with(applicationContext).load(response.body()!!.data.get(0).concert_img).into(iv_poster)




                    }

                }
            }
        )

        initViewPager()
        init()


    }
    fun init()
    {
        img_calender.setOnClickListener {
            val intent = Intent(applicationContext, CalendarActivity::class.java)
            startActivity(intent)
        }


    }
    fun initViewPager()
    {

        val pagerAdapter = MainTabAdapter(supportFragmentManager)
        val pager = findViewById<ViewPager>(R.id.viewPager)
        pager.adapter = pagerAdapter
        val tab = findViewById<TabLayout>(R.id.tab)
        tab.setSelectedTabIndicatorColor(Color.parseColor("#f9320c"));
        tab.setupWithViewPager(pager)
    }
}
