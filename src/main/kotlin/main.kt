fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toInt() //introduce cualquier dato y transformalo a entero
    val isEven = inputAsInteger % 2 == 0
    println("Is the number even? $isEven")
}