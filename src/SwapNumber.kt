

fun main() {

    var number1:Int = readLine()!!.toInt()
    var number2:Int = readLine()!!.toInt()

    val temp:Int = number1
    number1 = number2
    number2 = temp

    println("Number1: $number1, Number2: $number2")
}