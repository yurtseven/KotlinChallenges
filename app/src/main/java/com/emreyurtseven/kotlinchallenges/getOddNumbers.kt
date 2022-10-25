package com.emreyurtseven.kotlinchallenges

fun main(){
    val numberList = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    println("Original List: "+numberList)
    getOddNumbers(numberList)
    getEvenNumbers(numberList)
}
private fun getOddNumbers(list: List<Int>) {
    println("Odd Numbers: "+list.filter { it % 2 == 1 })
}

private fun getEvenNumbers(list: List<Int>) {
    println("Even Numbers: "+list.filter { it % 2 == 0 })
}