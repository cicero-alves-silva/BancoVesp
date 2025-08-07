package aplicacao;


import modelo.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca contaPoupanca = new ContaPoupanca("Maria", 50);
        System.out.println("DADOS DA CONTA");
        System.out.println("NÚMERO: " + contaPoupanca.getNumero());
        System.out.println("TITULAR: " + contaPoupanca.getNomeTitular());
        System.out.println("SALDO: " + contaPoupanca.getSaldo());

        contaPoupanca.depositar(50);
        System.out.println("\nSALDO APÓS DEPÓSITO: " + contaPoupanca.getSaldo());

        contaPoupanca.reajutar(0.05);
        System.out.println("\nSALDO APÓS REAJUSTE: " + contaPoupanca.getSaldo());

        contaPoupanca.sacar(25);
        System.out.println("\nSALDO APÓS SAQUE: " + contaPoupanca.getSaldo());
    }
}