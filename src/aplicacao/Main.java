package aplicacao;


import modelo.Cliente;
import modelo.Conta;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Conta conta = null;
        Cliente cliente = new Cliente("Ana", "111.111.111-11");
        Scanner teclado = new Scanner(System.in);
        System.out.println("---MENU DE OPÇÕES---");
        System.out.println("1- Criar conta Poupança");
        System.out.println("2- Criar conta Especial");
        System.out.print("Informe o tipo de conta de Ana: ");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1 -> conta = new ContaPoupanca(100, cliente);
            case 2 -> conta = new ContaEspecial(100, 100, cliente);
            default -> System.out.println("[ERRO] Tipo inválido!");
        }
        conta.imprimeTipoConta("IFPB BANK");
        System.out.println(conta);
        conta.depositar(100);
        System.out.println("SALDO APÓS DEPÓSITO: " + conta.getSaldo());
        if (conta.sacar(250)) {
            System.out.println("SAQUE EFETUADO COM SUCESSO!!!");
            System.out.println("SALDO APÓS SAQUE: " + conta.getSaldo());
        } else {
            System.out.println("SALDO INSUFICIENTE PARA O SAQUE!!!");
        }
    }
}