package poo.sobrecarga;

public class ConstrutorFalso {
    public ConstrutorFalso() {
        System.out.println("Um objeto foi criado!");
    }

    public int ConstrutorFalso() {
        System.out.println("Um objeto foi criado?");
        return 1;
    }

    public static void main(String[] args) {
        ConstrutorFalso obj = new ConstrutorFalso();
        System.out.println("Método construtor falso: " + obj.ConstrutorFalso());
    }
}
