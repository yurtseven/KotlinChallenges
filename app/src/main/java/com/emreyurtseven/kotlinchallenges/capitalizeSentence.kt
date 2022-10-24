package com.emreyurtseven.kotlinchallenges

fun main(){
    capitalizeSentence()
}
private fun capitalizeSentence(){
    val list = arrayListOf<String>("emre", "özge", "pınar", "meral", "halil", "şeyma", "elif")

    list.forEach {
        println(it.replaceFirstChar { it.uppercase() })
    }

}