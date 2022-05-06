package Exercicio04

import kotlin.math.pow

class Quadrado( val lado : Double): Quadrilatero(lado, lado , lado , lado) {
    override fun calcularArea(): Double {
        return lado.pow(2)
    }

    override fun mostrarInformacoes(forma: String) {
        println("${forma} : \n" +
                "Medida dos lados: $lado "+
                "Área = ${calcularArea()}; " +
                "Perimetro = ${calcularPerimetro()}")
        println("-----#####-----#####-----#####-----")
        println()
    }
}