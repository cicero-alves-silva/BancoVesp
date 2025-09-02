package modelo;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String nomeTitular, double saldo){
        super(nomeTitular, saldo);
    }

    public void reajustar(double percentual) {
        double rendimento = getSaldo() * percentual;
        this.saldo += rendimento;
//        setSaldo(getSaldo() + rendimento);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void imprimeTipoConta() {
        System.out.println("CONTA POUPANÇA");
    }

    @Override
    public void imprimeTipoConta(String nomeBanco) {
        System.out.println(nomeBanco + " - CONTA POUPANÇA");
    }
}
