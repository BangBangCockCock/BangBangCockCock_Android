## 방방콕콕 📱 _ 🕺흥부자들💃

👉🏻 집에서 방방뛰고 입장은 콕!(터치한번)

<br>

~~~
"죄송해요, 제가 방구석에 선약이 있어서,,"
~~~

거리두기 실천하고, 공연은 1000배로 즐기자

( 아무리 코로나가 와도 🔥흥🔥을 주체할수 없는 사람들을 위한 **방구석 콘서트 정보 플랫폼** )

<br>

---

### 🔥 구현 화면

<br>

---
<p align="center">
<img src="https://user-images.githubusercontent.com/52772787/83956526-01644580-a89a-11ea-9deb-f249481dc57b.png" alt="tablayout1" height="500px" />
</p>



### 🔥 구성

### Main

[카테고리]
* 전체
  * HorizontalScrollView - 좋아요 많은 순
  * 오늘 올라온 콘서트
  * RecyclerView - 최근 올라온 콘서트
* 아이돌
  * 
* 힙합
* DJ
* 락/인디

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

