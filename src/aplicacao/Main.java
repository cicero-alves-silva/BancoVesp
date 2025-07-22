package aplicacao;

import modelo.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Ana");
        conta1.depositar(100);
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta1.getNomeTitular());
        System.out.println("SALDO: " + conta1.getSaldo());
        System.out.println("QUANT. DE CONTAS: " + Conta.getContadorDeContas());
        System.out.println("==================================");

        Conta conta2 = new Conta("Maria", 1000);
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta2.getNomeTitular());
        System.out.println("SALDO: " + conta2.getSaldo());
        System.out.println("QUANT. DE CONTAS: " + Conta.getContadorDeContas());
    }
}