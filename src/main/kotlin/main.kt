fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull() ?: 0
    val isEven = inputAsInteger % 2 == 0
    println("is even: $isEven")
}