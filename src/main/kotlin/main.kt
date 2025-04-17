fun main(){
    println("Enter a string:")
    val input = readln()
    println("La palabra escogida es: $input")
    val reversed = reversed(input)
    println("Si la invertimos es: $reversed")
}

fun reversed(stringToReverse: String): String{
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
        }
    }
    return finalString
}