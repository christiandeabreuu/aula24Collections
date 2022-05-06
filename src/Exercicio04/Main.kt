package Exercicio04

fun main() {
    val circulo = "circulo"
    val quadrado = "quadrado"
    val retangulo = "retangulo"
    val mapFormas = mutableMapOf<FormaGeometrica, String>()
    val arrayFormas = ArrayList<FormaGeometrica>()

    println("Digite a quantidade de formas a calcular")
    val qtdFormas = readln().toInt()

    for (i in 0 until qtdFormas) {
        println("Digite o ${i + 1}º forma a ser calculada")
        var forma = readln().lowercase()
        while (forma != circulo && forma != quadrado && forma != retangulo) {
            println("Forma nao encontrada; \n Digite novamente: ")
            forma = readln().lowercase()
        }
        when (forma) {
            circulo -> {
                println("Digite o raio:")
                val raio = readln().toDouble()
                arrayFormas.add(Circulo(raio))
                mapFormas[arrayFormas[i]] = circulo
            }
            quadrado -> {
                println("Digite o lado:")
                val lado = readln().toDouble()
                arrayFormas.add(Quadrado(lado))
                mapFormas[arrayFormas[i]] = quadrado
            }
            retangulo -> {
                println("Digite o valor da base:")
                val base = readln().toDouble()
                println("Digite o valor da altura")
                val altura = readln().toDouble()
                arrayFormas.add(Retangulo(base, altura))
                mapFormas[arrayFormas[i]] = retangulo
            }
        }
    }
    println("#### Informações das Formas Geométricas ####")
    mapFormas.forEach{
        println("${it.value}: Área = ${it.key.calcularArea()}; \n Perimetro = ${it.key.calcularPerimetro()}")
        it.key.mostrarInformacoes(it.value)

    }
}