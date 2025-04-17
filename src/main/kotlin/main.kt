fun main(){
    println("Enter a string:")
    val input = readln()

    val reversed = reversed()
    println(reversed)

    if(input == reversed){
        println("Thats a palindrome!")
    }
}

fun reversed(stringToReverse: String = "hello world"): String{
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
        }
    }
    return finalString
}