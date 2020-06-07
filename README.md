## 방방콕콕 📱 _ 🕺흥부자들💃

👉🏻 집에서 방방뛰고 입장은 콕!(터치한번)

<br>
<img style="border: 1px solid black !important; border-radius:20px;" src="https://github.com/BangBangCockCock/BangBangCockCock_Server/blob/master/public/images/bangbangIcon.jpeg?raw=true" width="200px" />
<br>

~~~
"죄송해요, 제가 방구석에 선약이 있어서,,"
~~~

거리두기 실천하고, 공연은 1000배로 즐기자

( 아무리 코로나가 와도 🔥흥🔥을 주체할수 없는 사람들을 위한 **방구석 콘서트 정보 플랫폼** )

<br>

---

### 🔥 구현 화면

<p align="center">
<img src="https://user-images.githubusercontent.com/52772787/83956526-01644580-a89a-11ea-9deb-f249481dc57b.png" alt="tablayout1" height="800px" />
</p>
---

### 🔥 시현영상

<p align="center"><img src="/img/bangcock.gif" alt="Register" height="500px" /></p>



<br>

---

### 🔥 패키지

<p align="center">
  <img width="474" alt="Screen Shot 2020-06-07 at 9 26 20 AM" src="https://user-images.githubusercontent.com/45454585/83957210-05479600-a8a1-11ea-8a87-0661d8470d48.png">
</p>

<br>

크게 **adapter**, **viewholder**,**ui** ,**network**,**data**, **util** 로 나눴습니다!

<br>

> adapter - recycler view 관련 adapter
>
> viewholder - recycler view 관련 viewholder
>
> ui - fragment 와 activity 로 구성
>
> network - 서버 연결을 위한 파일
>
> data - recycler data 와 server response data
>
> util - horizantal Decoration , vertical Decoration ( RecyclerView 를 위한 decoration)

<br>

### 🔥 구현방식

<br>

### Main

####  ✔️ TabLayout을 이용한 ViewPager 생성

📌 Adapter

~~~kotlin
package com.example.bangbangcockcock_android.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.bangbangcockcock_android.HomeFragment
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
            2-> "코로나펀딩"
            3->"행사"
            else -> "락/인디"
        }
        return title
    }
}
~~~

<br>

📌 MainActivity

~~~kotlin
 fun initViewPager()
    {

        val pagerAdapter = MainTabAdapter(supportFragmentManager)
        val pager = findViewById<ViewPager>(R.id.viewPager)
        pager.adapter = pagerAdapter
        val tab = findViewById<TabLayout>(R.id.tab)
        tab.setSelectedTabIndicatorColor(Color.parseColor("#f9320c"));
        tab.setupWithViewPager(pager)
    }
~~~

<br>

#### ✔️ CoordinatorLayout + CollapsingToolbarLayout 응용한 탭 스크롤 뷰
<br>
<p align="center"><img src="/img/qq.gif" alt="Register" height="500px" /></p>
<br>

~~~kotlin
<?xml version="1.0" encoding="utf-8"?>
<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/white">



    <androidx.coordinatorlayout.widget.CoordinatorLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fitsSystemWindows="true"
        android:fillViewport="true"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent">



        <com.google.android.material.appbar.AppBarLayout
            android:id="@+id/lab3_appbar"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:fitsSystemWindows="true"
            android:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar">

        <com.google.android.material.appbar.CollapsingToolbarLayout
            android:id="@+id/collapsing_toolbar"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_scrollFlags="scroll|exitUntilCollapsed">


            <androidx.constraintlayout.widget.ConstraintLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:layout_collapseMode="parallax"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                android:id="@+id/cl_banner">

        <ImageView
                android:id="@+id/iv_poster"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:background="@drawable/main_img_tumbnail"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintHorizontal_bias="0.0"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.0" />



            <RelativeLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:id="@+id/rl_banner_title"
                android:paddingLeft="16dp"
                android:paddingRight="16dp"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                app:layout_constraintBottom_toBottomOf="@id/cl_banner"
                android:layout_marginBottom="40dp">

                <TextView
                    android:id="@+id/textView"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="포트나이트 라이브"
                    android:layout_alignParentLeft="true"
                    android:textColor="#2e2e2e"
                    android:textSize="20sp"
                    android:textStyle="bold"
                    />

                <Button
                    android:layout_width="40dp"
                    android:layout_height="20dp"
                    android:text="D-7"
                    android:textSize="14sp"
                    android:id="@+id/btn_dday"
                    android:layout_centerVertical="true"
                    android:layout_alignParentRight="true"
                    android:lineSpacingExtra="6sp"
                    android:textColor="@color/white"
                    android:background="@drawable/btn_dday"
                    android:layout_gravity="center_vertical"/>



            </RelativeLayout>


            <TextView
                android:id="@+id/textView_date"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:lineSpacingExtra="7sp"
                android:textColor="#2e2e2e"
                android:textSize="15sp"
                app:layout_constraintTop_toBottomOf="@id/rl_banner_title"
                app:layout_constraintLeft_toLeftOf="parent"
                android:layout_marginLeft="16dp"
                android:text="20.06.06" />

            <TextView
                android:id="@+id/tv_tag"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:lineSpacingExtra="7sp"
                android:textColor="@color/blue"
                android:layout_marginLeft="10dp"
                android:textSize="15sp"
                app:layout_constraintTop_toBottomOf="@id/rl_banner_title"
                app:layout_constraintLeft_toRightOf="@id/textView_date"
                android:layout_toRightOf="@id/textView_date"
                android:text="#콘서트" />


            </androidx.constraintlayout.widget.ConstraintLayout>


            <androidx.appcompat.widget.Toolbar
                android:id="@+id/lab3_toolbar"
                android:layout_width="match_parent"
                android:layout_height="60dp"
                android:layout_margin="8dp"
                app:layout_collapseMode="pin"/>

    </com.google.android.material.appbar.CollapsingToolbarLayout>



        <com.google.android.material.tabs.TabLayout
            android:id="@+id/tab"
            android:layout_width="match_parent"
            android:layout_height="40dp"
            android:background="#ffffff"
            app:tabSelectedTextColor="@color/black"
            app:tabTextColor="#c2c2c2"
            app:tabMode="fixed"
            android:layout_gravity="bottom"
            app:layout_collapseMode="pin"
            app:tabGravity="fill"/>

        </com.google.android.material.appbar.AppBarLayout>
        <androidx.viewpager.widget.ViewPager
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:id="@+id/viewPager"
            app:layout_behavior="@string/appbar_scrolling_view_behavior"/>


</androidx.coordinatorlayout.widget.CoordinatorLayout>



    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="60dp"
        android:layout_marginTop="20dp"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        android:id="@+id/rl_banner">


        <ImageView
            android:id="@+id/img_main_logo"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:background="@drawable/logo"
            android:layout_centerVertical="true"
            android:layout_centerHorizontal="true" />

        <ImageView
            android:id="@+id/img_calender"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerVertical="true"
            android:layout_marginRight="16dp"
            android:layout_alignParentRight="true"
            android:background="@drawable/main_btn_calendar"/>
    </RelativeLayout>




</FrameLayout>
~~~

<br>

#### ✔️ 다양한 RecyclerView 구현

<br>

### Calendar
* 관심있는 공연에 좋아요를 누르면 달력에 표시됨

```kotlin
// selection manager
        val mySelectionManager = object : CalendarSelectionManager {
            override fun canBeItemSelected(position: Int, date: Date): Boolean {

                calendarAdapter = CalendarAdapter(applicationContext)
                rv_calendar.adapter = calendarAdapter
                loadDatas()

                return when (cal[Calendar.DAY_OF_WEEK]) {
                    cal[Calendar.DAY_OF_WEEK] -> true
                    else -> true
                }
            }
        }
```

<br>

### 서버 연결

~~~kotlin
package com.example.bangbangcockcock_android.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RequestToServer {
    var retrofit = Retrofit.Builder()
        .baseUrl("http://3.34.151.159:3000") .addConverterFactory(GsonConverterFactory.create()) .build()
    var service: RequestInterface = retrofit.create(RequestInterface::class.java)
}
~~~

<br>

~~~kotlin
package com.example.bangbangcockcock_android.network

import com.example.bangbangcockcock_android.data.responseBanner
import com.example.bangbangcockcock_android.data.responseCategory
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface RequestInterface {

    @GET("/main/banner")
    fun getBanner() : Call<responseBanner>

    @GET("/main/filter/1")
    fun getConcert() : Call<responseCategory>

    @GET("/main/filter/2")
    fun getCorona() : Call<responseCategory>

    @GET("/main/filter/3")
    fun getFestival() : Call<responseCategory>

    @GET("/main/filter/4")
    fun getIdol() : Call<responseCategory>

    @GET("/main/filter/5")
    fun getRock() : Call<responseCategory>

}
~~~

<br>

~~~kotlin
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
                                    rv_category1.adapter = Adapter
                                    rv_category1.addItemDecoration(VerticalItemDecorator(28))
                                    rv_category1.addItemDecoration(HorizontalItemDecorator(16))

                                }

                            }
                        }
                    )
~~~

