package kr.co.tjoeun.a20191201_03_kotlinsyntex.datas

class User {

    var name =""
    var loginId =""

    override fun equals(other: Any?): Boolean {
        val otherUser = other as User

        return this.name == otherUser.name && this.loginId == otherUser.loginId
    }
}