package com.car.maintin

class Truck:CarOptions{ //Após os : estou herdando CarOptions, para isso CarOptions precisa estar com a class open

    var subType:String?=null
    constructor(type:String, model:Int, price:Double, milesDrive:Int, owner:String, subType:String):
            super(type, model, price, milesDrive, owner){   //o super indica utilização de informações herdadas de outra classe
        this.subType = subType
    }

    constructor(type:String, model:Int, price:Double, milesDrive:Int, subType: String):
            super(type, model, price, milesDrive){
        this.subType = subType
    }

    override fun getCarPrice():Double{  //Sobrescreve uma função, desde que ela esteja extendida na classe atual open na classe principal
        return this.getPrice()!! - (this.milesDrive!!.toDouble()*20)
        //this é utilizada para se referir a classe atual
    }

    /*fun getCarPriceWrapper():Double{
        //return super.getCarPrice()
        //super indica a classe pai, nesse caso a função getCarPrice é a presente em CarOptions
        return this.getCarPrice()
        //já this indica a classe atual, nesse caso a função é a acima
    }*/
}

fun Truck.getCarPriceWrapper():Double{  //adiciona uma extensão para a classe Truck
    return this.getCarPrice()
}

fun main(){
    val truck1 = Truck("BMW", 2015, 10000.0, 105, "Dump")
    truck1.type = "KIA"   //Posso alterar o valor da variável dessa mandeira, porem ela obrigatoriamente tem que ser var
    println(truck1.type)
    println(truck1.owner)
    println(truck1.getCarPrice())
    println(truck1.getCarPriceWrapper())

    val truck2 = Truck("Toyota", 2019, 39000.0, 10, "Garbage")
    println(truck2.type)
    println(truck2.owner)
    println(truck2.getCarPrice())
}