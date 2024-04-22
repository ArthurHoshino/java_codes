package atividades;
public class _635413_av_02 {
    private String nome;
    private String nascimento;
    private double altura;

    public _635413_av_02(String nome, String nascimento, double altura) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
    }
    public _635413_av_02() {}

    // GETTERS
    public String getNome() { return this.nome; }
    public String getNascimento() { return this.nascimento; }
    public double getAltura() { return this.altura; }

    // SETTERS
    public void setNome(String n) { this.nome = n; }
    public void setNascimento(String n) { this.nascimento = n; }
    public void setAltura(double a) { this.altura = a; }

    @Override
    public String toString() {
        return "Pessoa [Nome: " + this.nome + ", Nascimento: " + this.nascimento + ", Altura: " + this.altura + "]";
    }
}
