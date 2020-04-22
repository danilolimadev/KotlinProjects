package com.car.maintin

import java.util.*

class Car(var type:String, val model:Int, val price:Double, val milesDrive:Int, val owner:String){
    init {  //Função que é chamada sempre que é realizado uma nova chamada para essa classe
        println("Object class is created")
    }

    fun getCarPrice():Double{
        return this.price - (this.milesDrive.toDouble()*10)
    }

}

fun main() {
    /*
    val car1 = Car("BMW", 2015, 10000.0, 105, "Name1")
    car1.type = "KIA"   //Posso alterar o valor da variável dessa mandeira, porem ela obrigatoriamente tem que ser var
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())

    val car2 = Car("Toyota", 2019, 39000.0, 10, "Name2")
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())
*/
    var listOfCar = arrayListOf<Car>()
    listOfCar.add(Car("BMW", 2015, 10000.0, 105, "Name1"))
    listOfCar.add(Car("Toyota", 2019, 39000.0, 10, "Name2"))

    for (car in listOfCar){
        println("--------")
        println(car.owner)
        println(car.getCarPrice())
    }
}