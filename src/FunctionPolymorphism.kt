
fun showInfo(cardID:Int){
    println("CardID: $cardID")
}

fun showInfo(name:String){
    println("Name: $name")
}

fun main(){
    //Dependendo da informação contida nos parâmetros, é chamado uma função diferente
    showInfo("Name1")
    showInfo(12456)
}