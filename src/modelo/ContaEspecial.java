package modelo;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(double saldo, double limite, Cliente cliente){
        super(saldo, cliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.saldo + this.limite){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimeTipoConta() {
        System.out.println("CONTA ESPECIAL");
    }

    @Override
    public void imprimeTipoConta(String nomeBanco) {
        System.out.println(nomeBanco + " - CONTA ESPECIAL");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", limite= " + limite;
    }
}
