package aplicacao;

public class Conta {
    public static int contadorDeContas = 0;
    public String nomeTitular;
    public int numero;
    public double saldo;

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

    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public static int retornaQuantidadeDeContas() {
        return Conta.contadorDeContas;
    }
}
