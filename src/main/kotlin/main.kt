fun main(){
    println("how many numbers you will enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0


    val numbers = mutableListOf<Int>()
    for (i in 0 until amountOfNumbers){
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
    }


    println("Numbers: $numbers")
}