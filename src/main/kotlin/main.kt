fun main(){
    println("Enter a string:")
    val input = readln()
    // reverse string
    val finalString = buildString {
        for (i in input.lastIndex downTo 0){
            append(input[i])
        }
    }
    println(finalString)
}