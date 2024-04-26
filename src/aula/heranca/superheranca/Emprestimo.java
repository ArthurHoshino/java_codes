package aula.heranca.superheranca;

public class Emprestimo extends Servico {
    public double calculaTaxa() {
        return super.calculaTaxa() + 0.1;
    }
}
