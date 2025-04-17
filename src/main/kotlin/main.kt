import kotlin.math.PI
import kotlin.math.sqrt


fun main(){
    val rect1 = Rectangle( width = 5f, height = 7f)
    val rect2 = rect1.copy(height = 10f) // usar la funcion .copy
    val circle = Circle(radius = 5f)

    println("La area del circulo es ${circle.area}")

    println(rect2)

    println(rect1==rect2)
}



data class Rectangle (val width: Float, val height: Float) {

    val diagonal = sqrt(width * width + height * height)
    val area = width*height
}

data class Circle(val radius: Float){
    val area = radius * radius * PI
    val diameter = 2 * radius
}