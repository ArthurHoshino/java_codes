package poo.encapsulado;

public class ContaEncapsulada {
    private String nro;
    private double saldo;

    public ContaEncapsulada(String nro, double saldo) {
        this.nro = nro;
        this.saldo = saldo;
    }
    public ContaEncapsulada() { this("000.000-0", 0); }

    // Getter
    public String getNro() { return nro; }

    public double getSaldo() { return saldo; }

    // Setter
    public void setNro(String newNro) { this.nro = newNro; }

    public void setSaldo(double newSaldo) { this.saldo = newSaldo; }
}
