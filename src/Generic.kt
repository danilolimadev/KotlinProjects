
class UserAdmins<T> (credit:T){ //T indica temporário, pelo que entendi pode ser qualquer coisa que seja passado como parâmetro base
    //No geral é um valor genérico, podendo assumir qualquer coisa
    init {
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>){
    var userAdmin1 = UserAdmins<String>("Name")
    var userAdmin2 = UserAdmins<Int>(1234)
    var userAdmin3 = UserAdmins<Double>(123.4)

    display<Int>(22)
    display<String>("Process User")
}