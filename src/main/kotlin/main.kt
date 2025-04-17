fun main(){
    println("how many numbers you will enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0


    var sum = 0
    var i = 0
    while (i < amountOfNumbers) {
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: 0
        sum += number
        i++
    }

    println("the total sum is $sum")
}