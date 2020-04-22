
class Singleton{
    var name:String?=null
    private constructor(){
        println("instance is created")
    }

    companion object {
        val instance:Singleton by lazy { Singleton() }
        //Utilizando instance, quando inicializado uma classe nova, a classe Singleton é chamada somente uma vez, pois vai estar instancializada,
        //dessa maneira basta somente utilizar instance 
    }
}

fun main(args:Array<String>){
    var s1 = Singleton.instance
    s1.name = "Name"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)

    var s3 = Singleton.instance
    println(s3.name)
}