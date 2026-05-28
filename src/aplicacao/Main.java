import modelo.Conta;

void main() {
    Conta conta1 = new Conta("Ana");
    conta1.depositar(100);
    IO.println("DADOS DA CONTA");
    IO.println("TITULAR: " + conta1.getNomeTitular());
    IO.println("SALDO: " + conta1.getSaldo());
    IO.println("QUANT. DE CONTAS: " + Conta.getContadorDeContas());
    IO.println("==============================");

    Conta conta2 = new Conta("Maria", 1000);
    IO.println("DADOS DA CONTA");
    IO.println("TITULAR: " + conta2.getNomeTitular());
    IO.println("SALDO: " + conta2.getSaldo());
    IO.println("QUANT. DE CONTAS: " + Conta.getContadorDeContas());
    IO.println("==============================");
}