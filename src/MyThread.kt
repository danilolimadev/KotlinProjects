import java.lang.Exception


fun main(args: Array<String>) {
    var t1=thread("thread1")
    t1.start()  //Deve ser start, se for run apenas chamaria a função, sem executar a thread em sí

    var t2=thread("thread2")
    t2.start()

    var t3=thread("thread3")
    t3.start()
    t3.join()   //Não move para a linha de baixo até a thread t3 ser finalizada

    println("thread is run")
}

class thread():Thread(){
    var ThreadName:String = ""

    constructor(ThreadName:String):this(){
        this.ThreadName = ThreadName
        println("${this.ThreadName}")
    }

    override fun run(){
        //Write Thread

        var count=0
        while (count<10){
            println("${this.ThreadName}Count:$count")
            count++

            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                println(ex.message)
            }
        }
    }
}