package modelo;

public class Conta {
    private static int contadorDeContas = 0;
    private String nomeTitular;
    private int numero;
    private double saldo;

    public Conta(String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        Conta.contadorDeContas++;
    }

    public Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        Conta.contadorDeContas++;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public String getNomeTitular(){
        return this.nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public int getNumero() {
        return this.numero;
    }

    public static int getContadorDeContas() {
        return contadorDeContas;
    }
}
