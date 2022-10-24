package com.emreyurtseven.kotlinchallenges

fun main(){
    capitalizeSentence("function that capitalizes the initials of the words in this sentence")
    capitalizeWordList()
}
private fun capitalizeWordList(){
    val list = arrayListOf<String>("emre", "özge", "pınar", "meral", "halil", "şeyma", "elif")

    list.forEach {
        println(it.replaceFirstChar { it.uppercase() })
    }
}

private fun capitalizeSentence(word: String){

    println(word.split(" ").joinToString(" ") {
        it.replaceFirstChar { it.uppercase() }
    })
}
