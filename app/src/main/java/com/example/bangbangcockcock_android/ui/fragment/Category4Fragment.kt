package com.example.bangbangcockcock_android.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.bangbangcockcock_android.R
import com.example.bangbangcockcock_android.adapter.CategoryRecyclerAdapter
import com.example.bangbangcockcock_android.data.responseCategory
import com.example.bangbangcockcock_android.network.RequestToServer
import com.example.bangbangcockcock_android.util.HorizontalItemDecorator
import com.example.bangbangcockcock_android.util.VerticalItemDecorator
import kotlinx.android.synthetic.main.fragment_category1.*
import kotlinx.android.synthetic.main.fragment_category4.*
import retrofit2.Call
import retrofit2.Callback

/**
 * A simple [Fragment] subclass.
 */
class Category4Fragment : Fragment() {

    lateinit var Adapter : CategoryRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category4, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val requestToServer= RequestToServer
        requestToServer.service.getConcert()
            .enqueue(
                object : Callback<responseCategory> {
                    override fun onFailure(call: Call<responseCategory>, t: Throwable) {
                        Log.d("통신실패", "${t}")
                    }

                    override fun onResponse(
                        call: Call<responseCategory>,
                        response:retrofit2.Response<responseCategory>
                    ) {
                        if (response.isSuccessful) {
                            Adapter  = CategoryRecyclerAdapter(view!!.context,response.body()!!.data)
                            rv_category4.adapter = Adapter
                            rv_category4.addItemDecoration(VerticalItemDecorator(28))
                            rv_category4.addItemDecoration(HorizontalItemDecorator(16))

                        }

                    }
                }
            )




    }
    fun newInstant() : Category4Fragment
    {
        val args = Bundle()
        val frag = Category4Fragment()
        frag.arguments = args
        return frag
    }

}
