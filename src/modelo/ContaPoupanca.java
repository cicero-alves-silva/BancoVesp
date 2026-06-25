package modelo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String nomeTitular, double saldo){
        super(nomeTitular, saldo);
    }

    public void reajustar(double percentual){
        double rendimento = this.saldo * percentual;
        this.saldo += rendimento;
//        double rendimento = getSaldo() * percentual;
//        setSaldo(getSaldo() + rendimento);
    }
}
