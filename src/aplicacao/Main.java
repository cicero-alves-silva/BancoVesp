import aplicacao.Conta;

void main() {
    Conta conta1 = new Conta();
    Conta.contadorDeContas++;
    conta1.nomeTitular = "Ana";
    conta1.saldo = 0;
    conta1.depositar(100);
    IO.println("DADOS DA CONTA");
    IO.println("TITULAR: " + conta1.nomeTitular);
    IO.println("SALDO: " + conta1.saldo);
    IO.println("QUANT. DE CONTAS: " + Conta.retornaQuantidadeDeContas());
    IO.println("==============================");

    Conta conta2 = new Conta();
    Conta.contadorDeContas++;
    conta2.nomeTitular = "Maria";
    conta2.saldo = 1000;
    IO.println("DADOS DA CONTA");
    IO.println("TITULAR: " + conta2.nomeTitular);
    IO.println("SALDO: " + conta2.saldo);
    IO.println("QUANT. DE CONTAS: " + Conta.retornaQuantidadeDeContas());
    IO.println("==============================");
}