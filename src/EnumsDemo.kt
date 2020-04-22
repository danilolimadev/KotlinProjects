
enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main(args:Array<String>){

    var userDirection = Direction.SOUTH

    if(userDirection==Direction.NORTH){
        println("He wento to NORTH")
    }else{
        println("I don't know")
    }
}