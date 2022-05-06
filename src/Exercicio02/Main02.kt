package Exercicio02

fun main() {
    val listaNumeros = mutableSetOf<Int>()

    listaNumeros.add(1)
    listaNumeros.add(5)
    listaNumeros.add(5)
    listaNumeros.add(6)
    listaNumeros.add(7)
    listaNumeros.add(8)
    listaNumeros.add(8)
    listaNumeros.add(8)

    println(listaNumeros)
}

//set nao apareceu os números repetidos