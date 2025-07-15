package aplicacao;

public class Conta {
    static int contadorDeContas = 0;
    String nomeTitular;
    int numero;
    double saldo;

    Conta(String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        Conta.contadorDeContas++;
    }

    Conta(String nomeTitular) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0;
        Conta.contadorDeContas++;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    static int retornaQuantidadeDeContas() {
        return contadorDeContas;
    }
}
