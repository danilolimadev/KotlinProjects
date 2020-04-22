

val sum = {number1:Int, number2: Int ->
    number1 + number2
}

fun main(){

    val addNumbers = sum(3,4)
    println(addNumbers)

    val listOfNumbers = listOf(10,15,20,25,30)

    // normal for loop
    /*for(number in listOfNumbers){
        println(number)
    }*/
    listOfNumbers.forEach { number ->   //Faz a mesma coisa que o for acima, específico para listas
        println(number)
    }
}