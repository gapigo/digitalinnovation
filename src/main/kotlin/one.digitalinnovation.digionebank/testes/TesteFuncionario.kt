package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val jether = Pessoa(nome="Jether Rodrigues", cpf="123.456.789-00")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario(nome="João da Silva", cpf="111.222.333-44", salario = BigDecimal.valueOf(500.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}
