fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    if (inputAsInteger != null) {
        val isEven = inputAsInteger % 2 == 0
        if (isEven) {
            println("The number is Even")
        } else {
            println("The number is Odd")
        }
    } else {
        println("Enter a valid number!")
    }
}