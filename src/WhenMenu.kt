
fun main() {

    val foodID = readLine()!!.toInt()

    when(foodID){       //Como se fosse o swith

        1-> {
            println("1")
        }

        10-> {
            println("10")
        }

        else ->{
            println("Else")
        }

    }

    //Pode substituir if e else com condições :
    // when {
    //        grade >= 90 -> {
    //
    //        }
    //        grade in 80..89 -> {
    //
    //        }
    //        grade in 70..79 -> {
    //
    //        }
    //        grade < 70 -> {
    //
    //        }
    //    }

}