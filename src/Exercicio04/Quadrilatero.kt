package Exercicio04

abstract class Quadrilatero(var lado1 : Double, var lado2 : Double, var lado3 : Double, var lado4 : Double) : FormaGeometrica {
    override fun calcularPerimetro(): Double {
        return lado1 + lado2 + lado3 + lado4
    }

}