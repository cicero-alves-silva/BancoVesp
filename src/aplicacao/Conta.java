package aplicacao;

public class Conta {
    public static int contadorDeContas = 0;
    public String nomeTitular;
    public int numero;
    public double saldo;

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public static int retornaQuantidadeDeContas() {
        return contadorDeContas;
    }
}
