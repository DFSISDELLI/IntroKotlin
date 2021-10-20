package br.edu.ifsp.scl.sdm.introkotlin

fun main() {
    val familia : List<String> = listOf("Dafne, Adriano, Arthur, Zé, Sophia")

    for (integrante in familia){
        println(integrante)
    }


    val listaInteiros: List<Int> = (1..10 step 2). toList() // listOf (1,2,3,4,5,6,7,8,9,10)
    for (i in 0..4) {
        println(listaInteiros[i])
    }

    println("Imprimindo com Lambda")
    listaInteiros.forEach{ println(it)}

    val listaCursos : MutableList <String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desenvolvimentos de Sistemas"
    )
    listaCursos.add("Técnico em Informatica para Internet")

    listaCursos.forEach { println(it)  }

    val familiaMap: MutableMap <String, String> = mutableMapOf(
        Pair("Pai", "Adriano"),
        Pair("Mãe", "Dafne"),
        Pair("Filha", "Sophia"),
        Pair("Filho", "Zé"),
        Pair("Caçula", "Arthur")
    )
    familiaMap.put("Pet", "Kyara")
    familiaMap.keys.forEach { println("$it : ${familiaMap.get(it)}") }

}


