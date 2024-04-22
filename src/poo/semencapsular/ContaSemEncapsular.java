package poo.semencapsular;

public class ContaSemEncapsular {
    public String nro;
    double saldo;

    public ContaSemEncapsular(String nro, double saldo) {
        this.nro = nro;
        this.saldo = saldo;
    }

    public void atualizaSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }
}
