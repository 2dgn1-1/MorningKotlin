fun main() {

    //While loop
    var num = 25
    //In while loop before you print check for the condition
    while (num <= 20) {
        println("Number is $num")
        num ++
    }

    //For loop
    for (x in 30..40) {
        println("Number : $x")
    }

    for (letter in 'a'..'d') {
        println("My letter is $letter")
    }

    //Arrays
    var cars = arrayOf("Volvo", "Mercedes", "Toyota")

    for (car in cars) {
        println(car)
    }

    //Break and Continue
}