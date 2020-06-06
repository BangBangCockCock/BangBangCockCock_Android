package com.example.bangbangcockcock_android.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bangbangcockcock_android.R

/**
 * A simple [Fragment] subclass.
 */
class Category2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category2, container, false)
    }

    fun newInstant() : Category2Fragment {
        val args = Bundle()
        val frag = Category2Fragment()
        frag.arguments = args
        return frag
    }

}
