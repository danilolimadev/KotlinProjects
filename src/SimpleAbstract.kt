abstract class CreditCard(){
    fun CreditID():String{
        return "12345abcde"
    }
    abstract fun newCredit()
}

class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreditID()
    }

    override fun newCredit() {
        println("new card created")
    }
}
//Pelo que entendi não é possível acessar a classe diretamente, somente outra que extenda ela
fun main(args:Array<String>){

    //var credit = CreditCard()
    //println(credit.CreditID())
    var user = UserInfo()
    println(user.getInfo())
}