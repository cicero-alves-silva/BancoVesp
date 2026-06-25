import modelo.ContaPoupanca;

void main() {
    ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 50);
    IO.println("DADOS DA CONTA");
    IO.println("NÚMERO: " + contaPoupanca.getNumero());
    IO.println("TITULAR: " + contaPoupanca.getNomeTitular());
    IO.println("SALDO: " + contaPoupanca.getSaldo());

    contaPoupanca.depositar(50);
    IO.println("\nSALDO APÓS DEPÓSITO: " + contaPoupanca.getSaldo());

    contaPoupanca.reajustar(0.05);
    IO.println("\nSALDO APÓS REAJUSTAR: " + contaPoupanca.getSaldo());

    contaPoupanca.sacar(25);
    IO.println("\nSALDO APÓS SAQUE: " + contaPoupanca.getSaldo());
}