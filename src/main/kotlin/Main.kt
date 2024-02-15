package org.example

fun main() {
    println("Ingrese un número entero:")


    val userInput = readLine()

    try {
        // Convierte la entrada del usuario a un número entero
        val number = userInput?.toInt() ?: 0

        // Verifica si el número es primo
        if (isPrime(number)) {
            println("$number es un número primo.")
        } else {
            println("$number no es un número primo.")

        }
    } catch (e: NumberFormatException) {
        println("Por favor, ingrese un número entero válido.")
    }
}

fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}



