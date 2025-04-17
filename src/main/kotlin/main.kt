fun main(){
    println("Please enter a number:")
    val input = readln()
    throw Exception("dont know what an integer is?") // para meter avisos de erros en la consola
    val inputAsInteger = try {
        input.toInt()
    } catch (e: NumberFormatException){
        0
    }

        val output = when(inputAsInteger) {
            3 -> "the number is three!"
            5 -> "the number five"
            in 4..20 -> "the number is between 4 and 20"
            else -> "No idea what to print"
        }
        println(output)
}