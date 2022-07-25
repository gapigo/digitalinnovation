package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {

    val joao = Analista(nome="João da Silva", cpf="111.222.333-44", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(joao)

}
