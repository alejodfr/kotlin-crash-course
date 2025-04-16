fun main(){
    println("Please enter a number:")
    val input = readln()
    val inputAsInteger = input.toIntOrNull() ?: 0 // esta expresion remplaza el valor que da el usuario en caso de ser null por el numero que en esta ocasion es zero, partiendo del hecho de se introduzca un string que sera traducio en el programa como un null que dara cero
    val isEven = inputAsInteger % 2 == 0
    println("is even: $isEven")
}