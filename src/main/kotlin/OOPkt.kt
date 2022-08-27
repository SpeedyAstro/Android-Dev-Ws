import java.lang.IllegalArgumentException

class Car(name:String){
    private var firstProperty = "First property : $name".also(::println); //Kotlin classes allow printing properties in the declaration itself by using the also
    init { //The init block is run every time the class is instantiated
        println("First initializer block that prints $name")
    }
    fun start(){
        println(firstProperty)
    }
}
//Primary Constructors in Kotlin are defined in the class header itself as shown below.
class User(var name: String, private var isAdmin: Boolean) {
            //by default parameter values considers as val - immutable
    init {
        name += " @ JournalDev.com"
        println("Author Name is $name. Is Admin? $isAdmin")
    }
}
//Secondary Constructors are written inside the body of the class by prefixing with the keyword constructor. Following example demonstrates the same.
class Student(val name:String,val age:Int) {
    var skill: String = "NA"

    constructor(name: String, age: Int, skill: String) : this(name, age) {
        this.skill = skill
    }

    fun printDetails() {
//        if(skill.equals("NA"))
//            println("Name is $name and Age is $age")
//        else
//            println("Name is $name Age is $age and Skill is $skill")
        println("Name is $name , age is $age and skill is $skill")
    }
}
//
class Name1{
    var post : String = "default"
        set(value){if(value.isEmpty()){
            throw IllegalArgumentException("Enter a valid name")
        }
            field = value
        }
        get(){
            return field+"1"
        }

}
fun main(){
    val c = Car("Yash")
    c.start()
    User("Anubhav",true)
    val a = Student("Alex",21,"Fast Typing")
    a.printDetails()
    val name = Name1()
    name.post = "kotlin classes"
    println(name.post)
    name.post = "kotlin data Classes our next Tutorial"
    println(name.post)

}