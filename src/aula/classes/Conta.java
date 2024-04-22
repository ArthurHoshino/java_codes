package aula.classes;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String n, double s) {
        this.numero = n;
        this.saldo = s;
    }
    public Conta() { this("000.000-0", 0); }

    // GETTERS
    public String getNumero() { return this.numero; }
    public double getSaldo() { return this.saldo; }

    // SETTERS
    public void setNumero(String n) { this.numero = n; }
    public void setSaldo(double s) { this.saldo = s; }

    public void credito(double s) { this.saldo += s; }
    public void debito(double s) { this.saldo -= s; }

    @Override
    public String toString() {
        return "Numero: " + this.numero + "\nSaldo: " + this.saldo + "\n\n";
    }
}
