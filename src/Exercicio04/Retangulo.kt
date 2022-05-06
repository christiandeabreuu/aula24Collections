package Exercicio04

class Retangulo (private val base : Double, private var altura : Double) : Quadrilatero(base, altura, base , altura){
    override fun calcularArea(): Double {
        return base * altura
    }
    override fun mostrarInformacoes(forma: String) {
        println("${forma} : \n" +
                "Medida da base : $base "+
                "Medida da altura : $altura "+
                "Área = ${calcularArea()}; " +
                "Perimetro = ${calcularPerimetro()}")
        println("-----#####-----#####-----#####-----")
        println()
    }
}