package com.car.maintin

interface CreditCard{
    //Uma interface indica uma strutura, um esquema, um diagrama, uma interface de classe a ser utilizada, nesse caso quando utilizadas,
    //cada classe extendida possui o mesmo nome de função que no caso é score, porem com códigos diferentes

    //Ou seja, An interface is a way of designing your code when you have something shared between multiple, or you have a structure shared between
    //multiple classes and you want to centralize it and you want to add all for older parts follows same thing.
    val cardNumber:String

    fun score(age:Int)
}

class MasterCard(override val cardNumber: String) :CreditCard{

    override fun score(age: Int) {

        if(age>50){
            println("Negative")
        }else{
            println("Positive")
        }
    }

    fun print(){
        //A classe que obtém a interface pode ter seus próprios métodos sobressalentes, além dos obrigatórios pela interface
        println("Hello")
    }
}

class Visa(override val cardNumber: String) :CreditCard{

    override fun score(age: Int) {

        if(age>60){
            println("Negative")
        }else{
            println("Positive")
        }
    }
}

class PayPal(client:CreditCard):CreditCard by client{
    //Nada mais é do que um gerenciador de interface, com ele é possível passar como parâmetro qual interface desejo utilizar, nesse caso
    // Visa ou MasterCard. Porém somente o que está na interface, por exemplo, a função print() de MasterCard não poderá ser utilizada dessa maneira
    fun print(){
        println(this.cardNumber)
    }
}

fun main() {
    val visa = Visa("123456789")
    visa.score(60)

    val payPal1 = PayPal(visa)
    println("cardNumber PayPal: ${payPal1.cardNumber}")
    payPal1.print()

    val masterCard = MasterCard("987654321")
    masterCard.score(60)

    val payPal2 = PayPal(masterCard)
    println("cardNumber PayPal: ${payPal2.cardNumber}")
    payPal2.print()
}