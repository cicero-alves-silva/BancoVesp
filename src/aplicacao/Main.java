package aplicacao;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta.contadorDeContas++;
        conta1.nomeTitular = "Ana";
        conta1.saldo = 0;
        conta1.depositar(100);
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta1.nomeTitular);
        System.out.println("SALDO: " + conta1.saldo);
        System.out.println("QUANT. DE CONTAS: " + Conta.contadorDeContas);
        System.out.println("==================================");

        Conta conta2 = new Conta();
        Conta.contadorDeContas++;
        conta2.nomeTitular = "Maria";
        conta2.saldo = 1000;
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta2.nomeTitular);
        System.out.println("SALDO: " + conta2.saldo);
        System.out.println("QUANT. DE CONTAS: " + Conta.retornaQuantidadeDeContas());
    }
}