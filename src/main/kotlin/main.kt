import kotlin.math.sqrt


fun main(){
    val rect1 = Rectangle( width = 5f, height = 7f)
    println(rect1.width)
    println(rect1.height)
    println("The diagonal is ${rect1.diagonal}")
}

class Rectangle (val width: Float, val height: Float) {

    val diagonal = sqrt(width * width + height * height)
}