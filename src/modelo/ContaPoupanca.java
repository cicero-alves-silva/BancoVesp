package modelo;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nomeTitular, double saldo){
        super(nomeTitular, saldo);
    }

    public void reajutar(double percentual) {
        double rendimento = getSaldo() * percentual;
        this.saldo += rendimento;
    }

}
