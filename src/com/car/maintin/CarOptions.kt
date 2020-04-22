package com.car.maintin

open class CarOptions(){    //O open permite outras classes utilizarem ela como herança
    //Valores setados por default
    var type:String?=null
    var model:Int?=null
    private var price:Double?=null
    //private indica que não pode ser acessada por outras funções externas, já protected permite ser acessada
    //por outras classes que extendam a classe com a função protegida
    var milesDrive:Int?=0
    var owner:String?=null

    constructor(type:String, model:Int, price:Double, milesDrive:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(type:String, model:Int, price:Double, milesDrive:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }

    open fun getCarPrice():Double{   //open permite outras funções sobrescreverem ela quando extendidas, utilizando override
        return this.price!! - (this.milesDrive!!.toDouble()*10)
    }

    fun getPrice():Double{
        return this.price!!
    }
}

fun main() {
    val car1 = CarOptions("BMW", 2015, 10000.0, 105, "Name1")
    car1.type = "KIA"   //Posso alterar o valor da variável dessa mandeira, porem ela obrigatoriamente tem que ser var
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())

    val car2 = CarOptions("Toyota", 2019, 39000.0, 10)
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

}