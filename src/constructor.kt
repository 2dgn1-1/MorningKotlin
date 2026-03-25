class Dog(var breed:String, var age:Int, var gender:String){

    fun bark(){
        println("Woof!!Woof!!")
    }
}

fun main() {
    var dog1 = Dog("German Shepherd",3, "male")
    dog1.bark()


    var dog2 = Dog("Siberian Husky", 4, "Female")
}