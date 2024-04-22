package poo.sobrescrever;

public class Funcionario {
    double salario;
    public Funcionario(double salario) {
        this.salario = salario;
    }
    public Funcionario() { this(0); }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario + 500;
    }
}
