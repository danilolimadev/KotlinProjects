import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {

    println("1 - Read\n2- Write\n")
    val op = readLine()!!.toInt()

    when(op){
        1->ReadFromFile()

        2->{
            println("Write to file text:")
            var str:String = readLine().toString()
            WriteToFile(str)
        }
    }

}

fun WriteToFile(str:String){
    try {
        val fo=FileWriter("test.txt", true) //true indica incrementar o arquivo se já existente, não sobrescrever
        fo.write(str+"\n")
        fo.close()
        println("Data is saved")
    }catch (ex:Exception){
        println(ex.message)
    }
}

fun ReadFromFile(){
    try {
        val fin=FileReader("text.txt")
        var c:Int?
        do{
            c=fin.read()
            println(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception){
        println(ex.message)
    }
}