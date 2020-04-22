
/*
mutable: you can update, add more
im-mutable: you can't update, you can't add more
 */

fun main() {

    //1 - list

    //im-mutable    Não permite alterar elementos depois de criada
    var listImmutable = listOf("name1", "name2")
    for(name in listImmutable){
        println(name)
    }

    //mutable   Permite alterar elementos depois de criada
    var listMutable = mutableListOf("name1", "name2")
    listMutable[0]="Name3"
    for(name in listMutable){
        println(name)
    }

    var listOfUsersI = mapOf(1 to "name1", 2 to "name2")

    var listOfUsersM = mutableMapOf(1 to "name1", 2 to "name2")

}