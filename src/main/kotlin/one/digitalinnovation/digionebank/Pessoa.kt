package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcelo"

    var cpf: String = "123.123.123-12"
    private set
}

fun main() {
    val marcelo = Pessoa()

    println(marcelo)
    println(marcelo.nome)
    println(marcelo.cpf)
}