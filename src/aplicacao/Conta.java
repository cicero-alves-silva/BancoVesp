package aplicacao;

public class Conta {
    String nomeTitular;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
