

fun main(){

    for(userID in 1..2){
        println("$userID - Enter your name: ")
        var name = readLine()!!.toString()
        println("Where you live: ")
        var livePlace = readLine()!!.toString()
        var petName:String?=""
        println("Enter number of Pets: ")
        var petsCount = readLine()!!.toInt()
        for(petID in 1..petsCount){
            println("Enter Pet $petID: ")
            petName = petName + readLine()!!.toString() + ","
        }
        println("User info")
        println("name: $name")
        println("name: $livePlace")
        println("name: $petName")
        if(petName!!.contains("cat")){
            println("We have program for your cat")
        }
    }

}