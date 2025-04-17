fun main(){
    println("Choose a numbre from my array")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    val favoriteNumbers = intArrayOf(1, 2, 3, 69)

    if (inputAsInteger != null && inputAsInteger < favoriteNumbers.size){
        println("Your number is ${favoriteNumbers[inputAsInteger]}")
    } else {
        println("that index does not exist")
    }

}