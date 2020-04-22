
fun main() {

    /*
    Também indica um comentário em kotlin
     */
    print("Enter Name: ")
    val name:String = readLine()!!.toString()  //!! significa que o valor não pode ser null
    print("Enter Age: ")
    val age:Int = readLine()!!.toInt()
    print("Enter GPA: ")
    val GPA:Double = readLine()!!.toDouble()

    println("===== User info =====")
    println("Name: $name")  //= "Name: "+ name
    println("Age: $age")
    println("GPA: $GPA")


}