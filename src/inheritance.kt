open class Animal{
    var age = 2
    var gender = "male"

}

open class Horse :Animal(){
    fun movement(){
        println("Horse is galloping")
    }
}
class cat :Horse(){
    fun sound(){
        println("Meow!!Meow!!")
    }
}
//OPEN makes a class public or inheritable
fun main() {
    var a = Animal()
    var h = Horse()
    var c = cat()
}