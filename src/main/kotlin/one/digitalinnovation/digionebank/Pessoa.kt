package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Marcelo"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun infoPessoa() = "$nome e $cpf"
}

fun main() {
    val marcelo = Pessoa()

    println(marcelo.infoPessoa())
}