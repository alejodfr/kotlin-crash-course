import kotlin.math.sqrt


fun main(){
    val rect1 = Rectangle( width = 5f, height = 7f)
    val rect2 = Rectangle(width = 5f, height = 7f)
    val rect3 = Rectangle(width = 5f, height = 8f)

    println(rect1)
    println(rect3)

    println(rect1==rect2)
    println(rect1==rect3)
}



data class Rectangle (val width: Float, val height: Float) {

    val diagonal = sqrt(width * width + height * height)
    val area = width*height
}