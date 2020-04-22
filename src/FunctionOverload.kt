

fun add(number1:Int, number2:Int):Int{
    return number1 + number2
}

fun add(number1:Int, number2:Int, number3: Int):Int{
    return number1 + number2 + number3
}

fun add(number1:Int, number2:Int, number3: Int, number4: Int):Int{
    return number1 + number2 + number3 + number4
}

fun main(){

    //Nesses casos é chamada uma função diferente dependendo da quantidade de parâmetros passados
    println(add(3,4))
    println(add(3,4,5))
    println(add(3,4,5,6))
}