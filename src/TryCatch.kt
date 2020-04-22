import java.lang.Exception

fun main(args:Array<String>){

    try {
        var n2:Int= readLine()!!.toInt()
        var Div=100/n2
        println(Div)
    }catch (ex:Exception){
        println(ex.message)
    }
    println("app is done")
}