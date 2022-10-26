package com.emreyurtseven.kotlinchallenges

fun main(){
    val stationsNameList = arrayListOf<String>("Karamürsel", "Gölcük", "İzmit")
    formatTrainRoute(stationsNameList)
}

private fun formatTrainRoute(stationsName: List<String>){
    val text = "Train is calling at "
    if(stationsName.size == 1){
        println(text + stationsName[0] )
    }

    val lastStation = stationsName.takeLast(1)
        .joinToString { it }
    val followingStation = stationsName.dropLast(1)
        .joinToString { it }
    println(text + followingStation +" and " + lastStation)
}