fun main() {

    //Program to check for room condition

    var temperature = 56
    //conditions are kept under brackets
    if (temperature > 25) {
        println("It is too hot")
    }

    else if (temperature < 25) {
        println("It is too cold")
    }

    else {
        println("Normal temperature")
    }

    //Program to check for even or odd number

    var number = 35

    if (number % 2 == 0) {
        println("My number is : $number")
        println("$number is even number")
    }

    else {
        println("$number is odd number")
    }
}