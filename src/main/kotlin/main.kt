import java.util.function.Predicate

fun main(){
    println("Enter a string:")
    val input = readln()

    val favoriteNumbers = intArrayOf(1,2,3,69)
    val evenNumbers = favoriteNumbers.map {
        it * it
    }

    val letterOnly = input.filter {
        it.isLetter()
    }


    println(evenNumbers)
}

fun String.myFilter(predicate: (Char) -> Boolean): String {
    return buildString {
        for(char in this@myFilter) {
            if (predicate(char)){
                append(char)
            }
        }
    }
}