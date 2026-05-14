import aplicacao.Conta;

void main() {
    Conta conta1 = new Conta();
    conta1.nomeTitular = "Ana";
    conta1.saldo = 0;
    conta1.depositar(100);
    IO.println("DADOS DA CONTA");
    IO.println("TITULAR: " + conta1.nomeTitular);
    IO.println("SALDO: " + conta1.saldo);
}