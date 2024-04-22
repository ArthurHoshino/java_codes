package poo;

public class Conta {
    public String numero;
    public double saldo;

    // metodo construtor
    public Conta (String nro, double saldoInicial) {
        this.numero = nro;
        this.saldo = saldoInicial;
    }

    public void credito (double valor) {
        this.saldo += valor;
    }

    public void debito (double valor) {
        this.saldo -= valor;
    }
}