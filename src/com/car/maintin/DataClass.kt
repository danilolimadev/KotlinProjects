package com.car.maintin

data class Person(val name:String, val age:Int, val gender:String)
//data class somente cria um objeto com alguns atributos, nem nenhuma função ou execução dentro

fun main() {

    val person = Person("Name1", 30, "Gender")
    println("person.name: ${person.name}")
    println("person.name: ${person.age}")
    println("person.name: ${person.gender}")
}