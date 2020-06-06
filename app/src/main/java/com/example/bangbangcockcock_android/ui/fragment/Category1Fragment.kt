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
class Category1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category1, container, false)
    }

    fun newInstant() : Category1Fragment {
        val args = Bundle()
        val frag = Category1Fragment()
        frag.arguments = args
        return frag
    }

}
