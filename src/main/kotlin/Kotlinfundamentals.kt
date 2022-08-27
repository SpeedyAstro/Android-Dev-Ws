fun main(){
    println("Total is ${getAddition(24,22)}")
    showGreeting("Alex",7);
    //list interface
    println(fruits.size)
    //loop
    fruits.forEach{
        fruit->
        println(fruit)
    }
//    fruits.add("strawberry") cant be added since default list is immutable List<String>
    fruits.add("Strawberry")
    println(fruits.size)
}
fun getAddition(num1 :Int , num2 : Int) = num1+num2
// function overloading
fun showGreeting(){
    println("Welcome!")
}
fun showGreeting(name:String){
    println("Hello $name")
}
fun showGreeting(name:String,roll:Int){
    println("Welcome! $name , your roll is $roll")
}
val fruits : MutableList<String> = mutableListOf("banana", "Orange","Mango")