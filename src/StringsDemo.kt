
fun main(){

    val message = " Welcome to new new new York"
    val name = "Name"
    val allMessage = "$name,$message"
    println(allMessage[0])
    println(allMessage.toLowerCase())
    println(allMessage.toUpperCase())
    println(message.trim()) //Ignorando espaço inicial
    println(message)
    val listOfTokens = message.trim().split(" ") //Obtem um vetor que é delimitado pelo delimitador escolhido, nesse caso o " "(espaço)
    for(token in listOfTokens){ //Posso utilizar um vetor em conjunto com um for, nesse caso ele passa por todos os elementos do vetor
        if(!token.contains("to") && !token.contains("is")){
            println("token: $token")
        }
    }

}