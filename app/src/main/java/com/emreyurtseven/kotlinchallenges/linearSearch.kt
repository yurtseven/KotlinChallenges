package com.emreyurtseven.kotlinchallenges

fun main(){
    var wordList = arrayListOf<String>("A","B","C","D","E")
    linearSearch("C",wordList)
}

private fun linearSearch(str: String, list: List<String>) {

    list.forEachIndexed { index, element ->
        if (element == str)
            println(element + " = Index[" + index.toString() + "]")
        else
            println(element)
    }
}
