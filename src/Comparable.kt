

class Person(var name:String, var age:Int): Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }

}

fun main(args: Array<String>) {
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("DName1", 3))
    listOfNames.add(Person("CName2", 1))
    listOfNames.add(Person("BName3",28))
    listOfNames.add(Person("AName4",2))
    println("before short")
    for (person in listOfNames){
        println(person.name)
        println(person.age)
    }
    println("after short")
    listOfNames.sort()
    for (person in listOfNames){
        println(person.name)
        println(person.age)
    }
}