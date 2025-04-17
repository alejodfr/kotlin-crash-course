import kotlin.math.PI
import kotlin.math.sqrt


fun main(){
    val rect1 = Rectangle( width = 5f, height = 7f)
    val circle = Circle(radius = 5f)
    val shape = Shape()

    println(sumAreas(rect1, circle))
}

fun sumAreas(vararg shapes: Shape): Double{
    return shapes.sumOf { curentShape ->
        curentShape.area.toDouble()
    }
}

abstract class Shape {
    abstract val area: Float
    abstract val circumference: Float
}

/*interface Shape{
    val area: Float
    val circumference: Float
}*/

data class Rectangle (val width: Float, val height: Float): Shape(){

    val diagonal = sqrt(width * width + height * height)
    override val area = width*height
    override val circumference = 2 * width + 2 * height

}

data class Circle(val radius: Float): Shape(){
    override val area = radius * radius * PI.toFloat()
    override val circumference = 2 * radius * PI.toFloat()
    val diameter = 2 * radius
}