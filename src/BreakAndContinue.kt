

fun main() {

    println("Continue Example")
    for(number in 1..10){
        if(number==5){
            continue    //Não continua essa condição do loop, pula para a próxima
        }
        println(number)
    }

    println("Break Example")
    for(number in 1..10){
        if(number==6){
            break    //Não sai loop, encerra ele
        }
        println(number)
    }

    println("Break Inner Example")
    loop@ for(number in 1..10){
        for(innerLoop in 1..7){
            println("innerLoop: $innerLoop")
            if(innerLoop==6){
                break@loop    //Sai do loop indicado
            }
        }
        println(number)
    }

}