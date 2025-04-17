fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()

        val output = when(inputAsInteger) {
            null -> "enter a valid number"
            3 -> "the number is three!"
            5 -> "the number five"
            in 4..20 -> "the number is between 4 and 20"
            else -> "No idea"
        }
        println(output)
}