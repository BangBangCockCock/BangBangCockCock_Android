package com.example.bangbangcockcock_android.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bangbangcockcock_android.ui.fragment.*

class MainTabAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getCount(): Int =5

    override fun getItem(position: Int): Fragment {
        return when(position)
        {
            0-> HomeFragment()
            1-> Category1Fragment()
            2-> Category2Fragment()
            3-> Category3Fragment()
            else-> Category4Fragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val title = when(position)
        {
            0-> "전체"
            1-> "아이돌"
            2-> "힙합"
            3->"DJ"
            else -> "기타"
        }
        return title
    }
}