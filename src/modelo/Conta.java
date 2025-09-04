package modelo;

public abstract class Conta {
    private static int contadorDeContas = 0;
    private int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(double saldo, Cliente cliente){
        this.saldo = saldo;
        Conta.contadorDeContas++;
        this.numero = Conta.contadorDeContas;
        this.cliente = cliente;
    }

    public Conta(Cliente cliente) {
        this.saldo = 0;
        Conta.contadorDeContas++;
        this.numero = Conta.contadorDeContas;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract boolean sacar(double valor);

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

    public Cliente getCliente() {
        return cliente;
    }

    public void imprimeTipoConta() {
        System.out.println("CONTA PADRÃO");
    }

    public void imprimeTipoConta(String nomeBanco) {
        System.out.println(nomeBanco + " - CONTA PADRÃO");
    }

    @Override
    public String toString() {
        return "numero= " + numero + ", " + cliente +  ", saldo=" + saldo;
    }
}
