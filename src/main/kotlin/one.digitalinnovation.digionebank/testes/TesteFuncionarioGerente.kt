package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(nome="Maria de souza", cpf="555.111.999-55", salario=5000.0, senha="senha123")
    imprimeRelatorioFuncionario.imprime(maria)
    TesteAutenticacao().autentica(maria)
}
