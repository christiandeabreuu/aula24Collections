const val CHAVE_1 = "chave1"
const val CHAVE_2 = "chave2"
const val CHAVE_3 = "chave3"
const val CHAVE_4 = "chave4"

fun main() {
    val numerosMap = mapOf(
        CHAVE_1 to 1,
        CHAVE_2 to 2,
        CHAVE_3 to 3,
        CHAVE_4 to 4,

    )

    println("Todas as chaves: ${numerosMap.keys}")
    println("todos os valores: ${numerosMap.values}")
    if (CHAVE_2 in numerosMap) {
    println("Valor da chave \"chave2\": ${numerosMap[CHAVE_2]}")
    }
    if (1 in numerosMap.values) {
        println("O valor 1 esta no mapa")
    }
    if (numerosMap.containsValue(1)) {
        println("O valor 1 esta no MAPA")
    }
    println("-----------Exemplo mutableMapOf()---------")
    val nomesMap = mutableMapOf<Int, String>()

    nomesMap[1] = "Jessica"
    nomesMap.put(2, "Carol")
    nomesMap.put(3, "Carol")
    nomesMap.put(4, "Charles")
    println(nomesMap)

    nomesMap.remove(3)
    println(nomesMap)

    nomesMap[3] = "Cleber"
    println(nomesMap)

    println("------Exemplos de HashMap------")

    val estudantes = HashMap<String, Int>()
    estudantes["thayane"] = 100
    estudantes["Victor"] = 105
    estudantes["Luiz"] = 102
    estudantes["Allan"] = 108
    println("Elementos Mapa estudantes")
    println(estudantes)



    val funcionarios = HashMap<String, Int>()
    funcionarios["Carol"] = 110
    funcionarios["Jess"] = 112
    println("Elementos Mapa funcionario")
    println(funcionarios)

    estudantes.putAll(funcionarios)

    funcionarios["Charles"] = 999
    println(funcionarios)
    println(estudantes)

    println("Elementos no mapa de estudantes depois do uso do metodo putAll")
    println(estudantes)


}