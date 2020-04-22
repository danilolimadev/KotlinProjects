

/*fun showUserInfo(name:String){
//Gera um erro se o nome da função for showInfo pois já há uma função com esse nome.
// Nesse caso é como se todos os projetos contidos na pasta src fossem adicionados como import
    println("name: $name")
}*/

var name:String?=null   //Criação de uma variável global, para ser acessada em funções diferentes

fun showUserInfo(){
    name="Welcome $name"
    println("name: $name")
}

fun main(){
    name = "Name123"
    showUserInfo()
}