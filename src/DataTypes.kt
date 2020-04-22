
fun main() {

    //val str = "Welcome to Kotlin"
    //var str:String
    //str = "Welcome to Kotlin"

    val name = "MyName"  //val é um variável somente de leitura, uma vez nomeada não pode ser alterada
    val age = 30
    val GPA = 5

    println("===== User info =====")
    println("Name: $name")  //= "Name: "+ name
    println("Age: $age")
    println("GPA: $GPA")

    var count = 1   //var é uma variável que pode ser escrita mais de uma vez
    println("Count: $count")
    count = 10
    println("Count: $count")

    var department:String?
    department = null
    department = "Software Engineering"
    println("Department: ${department!!}")  //variável não pode ser nula, tem que ter um valor

}