

fun addNumbers(x:Double, y: Double):Double{
//Só é necessário especificar nesse caso com :Double caso reseje retornar algo, se não retornar nada não especifica
    val temp = x + y;
    return temp
}

fun addNumbers2(x:Double=0.0, y: Double=0.0):Double{
//Caso não espefique nada na função, ela admite os valores indicados
    val temp = x + y;
    return temp
}

fun displayInfo(vararg names:String){
//Ou posso passar como parametro para a função: names: Array<String>, desse jeito não preciso do * antes do arrayOf quando chamo a função
    for(name in names){
        println(name)
    }
}

fun main(){
    var returnAdd = addNumbers(3.0,4.0)
    println("returnAdd: $returnAdd")

    var returnAdd2 = addNumbers2()
    println("returnAdd: $returnAdd2")

    displayInfo(names = *arrayOf("name1", "name2", "name3"))
}