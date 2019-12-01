package kr.co.tjoeun.a20191201_03_kotlinsyntex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lottoNumArr = ArrayList<Int>()

        lottoNumArr.add(10)
        lottoNumArr.add(42)
        lottoNumArr.add(17)
        lottoNumArr.add(0,15 )

        Log.d("로또번호 입력한 갯수","${lottoNumArr.size} 개 입력됨" )
        Log.d("42는 몇번칸에?","${lottoNumArr.indexOf(42)} 번칸에")
        Log.d("1번칸에는 뭐가들어있나?", "${lottoNumArr.get(1)}")

//        42를 배열에서 빼내고 싶다.
        lottoNumArr.remove(45)
        lottoNumArr.removeAt(0)
        Log.d("로또번호 입력한 갯수","${lottoNumArr.size} 개 입력됨" )


    }
}
