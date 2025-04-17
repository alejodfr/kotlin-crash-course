fun main(){
    println("Enter a string:")
    val input = readln()

    val favoriteNumbers = intArrayOf(1,2,3,69)
    val evenNumbers = favoriteNumbers.filter { it % 2 == 0 }

    val letterOnly = input.filter {
        it.isLetter()
    }
    println(evenNumbers)
}