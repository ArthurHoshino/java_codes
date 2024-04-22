package poo.semencapsular;

public class TesteSemEncapsular {
    public static void main(String[] args) {
        ContaSemEncapsular c = new ContaSemEncapsular("1234", 100);
        c.nro = "4321";
        c.saldo = 200;

        System.out.println("\n<=== Dados da conta ===>\nNumero: " + c.nro + "\nSaldo: " + c.saldo);
    }
}
