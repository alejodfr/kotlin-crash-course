fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    if (inputAsInteger != null) {
        val output = if (inputAsInteger % 2 == 0){
            "the number is even"
        } else {
            "The number is odd"
        }
        println(output)
    } else {
        println("Enter a valid number!")
    }
}