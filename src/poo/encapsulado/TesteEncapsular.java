package poo.encapsulado;

public class TesteEncapsular {
    public static void main(String[] args) {
        ContaEncapsulada c = new ContaEncapsulada();

        c.setNro("123.456-7");
        c.setSaldo(450);

        System.out.printf("Numero da conta: %s\nSaldo da conta: %.2f", c.getNro(), c.getSaldo());
    }
}
