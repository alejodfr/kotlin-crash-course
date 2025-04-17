fun main(){
    println("how many numbers you will enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0


    val numbers = mutableListOf<Int>()
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
        i++
    }

    println("Numbers: $numbers")
}