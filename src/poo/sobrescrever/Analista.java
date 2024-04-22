package poo.sobrescrever;

public class Analista extends Funcionario{
    @Override
    public void setSalario(double s) {
        this.salario = s + 100;
    }
}
