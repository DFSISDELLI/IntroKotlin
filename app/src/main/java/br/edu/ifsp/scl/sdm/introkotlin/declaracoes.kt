package br.edu.ifsp.scl.sdm.introkotlin

fun main() {
    // declaracao de variavel
    var frase: String = "Hello, World!"

    println(frase)
    println("$frase")
    println("${frase}")

    println("Quantidade de caracteres: ${frase.count()}")
    println("Quantidade de caracteres: ${frase.length}")


}