open class Cow{
    open fun sound(){
        println("Moo!!Moo!!")
    }
}
class Lion : Cow(){
    override fun sound() {
        println("Roar!!")
    }
}

fun main() {
    var c = Cow()
    c.sound()
    var l  = Lion()
    l.sound()
}