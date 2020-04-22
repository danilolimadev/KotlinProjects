

fun main() {

    for(i in 0..100 step 2){  //step indica o quanto aumenta de um para o outro
        println("Incrementing $i")
    }

    for(i in 100 downTo 0 step 2){  //Decrescente
        println("Decrementing $i")
    }

}