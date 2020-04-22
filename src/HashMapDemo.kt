
fun main() {    //Basicamente matriz

    var listOfUsers = HashMap<Int, String>()
    listOfUsers[123] = "Name"
    listOfUsers[554] = "Gender"
    listOfUsers[12] = "Age"

    for(key in listOfUsers.keys)
    println("$key: ${listOfUsers[key]}")

}