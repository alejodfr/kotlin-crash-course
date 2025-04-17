fun main(){
    println("how many numbers you will enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0


    var numbers = intArrayOf()
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers += number
        i++
    }

    println("Numbers: ${numbers.contentToString()}")
}