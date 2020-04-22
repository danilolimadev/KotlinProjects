package com.car.maintin


fun ArrayList<Int>.findMax():Int{
//Extendendo uma função, desse jeito posso adicionar funções a elementos já existentes em bibliotecas por exemplo, ainda que seja um ArrayList
    var maxNumber = 0
    for(item in this){
        if(item > maxNumber){
            maxNumber = item
        }
    }
    return maxNumber
}

fun main() {

    val listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(14)
    listOfElements.add(16)
    listOfElements.add(18)
    for (item in listOfElements){
        println(item)
    }

    println("Max = ${listOfElements.findMax()}")
}