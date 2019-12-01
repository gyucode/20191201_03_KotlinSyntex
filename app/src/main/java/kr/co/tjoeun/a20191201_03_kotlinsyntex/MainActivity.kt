package kr.co.tjoeun.a20191201_03_kotlinsyntex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.tjoeun.a20191201_03_kotlinsyntex.datas.User
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


        val userList = ArrayList<User>()
        val user1=User()
        user1.name = "이규현"
        user1.loginId="lkh"
        userList.add(user1)

        val user2 =User()
        user2.name = "하하"
        user2.loginId="st2"
        userList.add(user2)

        val user4 =User()
        user4.name = "후후"
        user4.loginId="st4"
        userList.add(user4)


        Log.d("들어있는 사람수", "${userList.size} 명")
        Log.d("1번칸에 있는 사람이름", "${userList.get(1).name}")

        val user3 = User()
        user3.name = "규현"
        user3.loginId = "cho881020"

        Log.d("규현이 있는 위치 ", "${userList.indexOf(user3)}")
//        userList

//        var count = 0
//        while(true){
//            count++
//            if ( count >= 10){
//                break
//            }
//        }

//    사용자 목록에 있는 사람들의 이름/아이디 출력
        for( user in userList){
            Log.d("사람이름/아이디","${user.name}/${user.loginId}")
        }



    }
}
