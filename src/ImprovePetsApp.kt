import java.util.*
import kotlin.collections.HashMap

fun main(){

    var listOfUsers = HashMap<String, LinkedList<String>>()
    while(true){
        println("Enter your name or quit: ")
        var name = readLine()!!.toString()
        if(name=="quit")break
        println("Where you live: ")
        var livePlace = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>()
        do{
            println("Enter Pet name or type next: ")
            val petName = readLine()!!.toString()
            if(petName!="next"){
                listOfUserPets.add(petName)
            }
        }while (petName!="next")

        listOfUsers["$name:$livePlace"] = listOfUserPets
    }

    for(key in listOfUsers.keys){
        println("User info")
        println("name and place live: $key")
        //println("name: $livePlace")
        val listOfPets = listOfUsers[key]!!
        for(petName in listOfPets){
            println("name: $petName")
        }

        if(listOfPets.contains("cat")){
            println("We have program for your cat")
        }
    }

}