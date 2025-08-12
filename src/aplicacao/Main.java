package aplicacao;


import modelo.Conta;
import modelo.ContaEspecial;
import modelo.ContaPoupanca;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Conta conta = null;
        Scanner teclado = new Scanner(System.in);
        System.out.println("---MENU DE OPÇÕES---");
        System.out.println("1- Criar conta Padrão");
        System.out.println("2- Criar conta Poupança");
        System.out.println("3- Criar conta Especial");
        System.out.print("Informe o tipo de conta de Ana: ");
        int opcao = teclado.nextInt();
        switch (opcao) {
            case 1 -> conta = new Conta("Ana", 100);
            case 2 -> conta = new ContaPoupanca("Ana", 100);
            case 3 -> conta = new ContaEspecial("Ana", 100, 100);
            default -> System.out.println("[ERRO] Tipo inválido!");
        }
        System.out.println("NÚMERO: " + conta.getNumero());
        System.out.println("TITULAR: " + conta.getNomeTitular());
        System.out.println("SALDO INICIAL: " + conta.getSaldo());
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