package com.emreyurtseven.kotlinchallenges

fun main(){
       countDown(10)
}
private fun countDown(n: Int) {

    val numberList = arrayListOf<Int>()
    for (n in 0..n) {
        numberList.add(n)
    }
    numberList.reverse()
    numberList.forEach { println(it) }

}
