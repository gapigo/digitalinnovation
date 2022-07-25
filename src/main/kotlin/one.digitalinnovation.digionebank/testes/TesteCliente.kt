package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        nome = "Jose Da Silva",
        cpf = "123.123.123-99",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)
    TesteAutenticacao().autentica(jose)
}