fun main() {
    var Firstname = "Daniel"
    var Lastname = "Gichuhi"
    var school = "eMobilis"

    println(Firstname[0])
    println(Firstname.uppercase())
    println(Lastname.lowercase())
    println(Firstname + Lastname) //String concatenation
    println(Firstname + " " + Lastname)
    println("My name is " + Firstname + "I study at "+ school)
          //or           //String Interpolation
    println("My name is $Firstname, I study at $school" )

}