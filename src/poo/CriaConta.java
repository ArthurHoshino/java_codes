package poo;

class CriaConta {
    public static void main(String[] args) {
        Conta c = new Conta("123.456-7", 450);
        
        c.credito(16.45);
        c.debito(100.67);

        System.out.println("\n<=== Dados da conta ===>\nNumero: " + c.numero + "\nSaldo: " + c.saldo);
    }
}