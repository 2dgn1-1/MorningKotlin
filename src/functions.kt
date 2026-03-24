fun main() {

    //Standard library functions

    var number = Math.sqrt(169.0)
    println(number)

    var num = Math.max(23, 56)
    println(num)

    //calling is done in the main function
    day()

    println()

    student(name = "mark", age = 20)
    student(name = "John", age = 19)

}

//User defined functions
fun day() {
    println("Today is Wednesday ")
}

fun student(name: String, age: Int) {
    println("$name is $age years old")
}