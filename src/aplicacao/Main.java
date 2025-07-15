package aplicacao;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Ana");
        conta1.depositar(100);
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta1.nomeTitular);
        System.out.println("SALDO: " + conta1.saldo);
        System.out.println("QUANT. DE CONTAS: " + Conta.contadorDeContas);
        System.out.println("==================================");

        Conta conta2 = new Conta("Maria", 1000);
        System.out.println("DADOS DA CONTA");
        System.out.println("TITULAR: " + conta2.nomeTitular);
        System.out.println("SALDO: " + conta2.saldo);
        System.out.println("QUANT. DE CONTAS: " + Conta.retornaQuantidadeDeContas());
    }
}