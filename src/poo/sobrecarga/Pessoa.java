package poo.sobrecarga;
import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private int idade;
    private String telefone;
    private String nascimento;
    private float altura;
    
    public Pessoa(String nome, int idade, String fone, String nascimento, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = fone;
        this.nascimento = nascimento;
        this.altura = altura;
    }
    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.telefone = "0000-0000";
        this.nascimento = "00/00/000";
        this.altura = 0;
    }

    // Setters
    public void setTelefone(String f) { this.telefone = f; }
    public void setTelefone() { this.telefone = JOptionPane.showInputDialog(("Novo telefone")); }

    public void setNome(String n) { this.nome = n; }
    public void setNome() { this.nome = JOptionPane.showInputDialog(("Novo nome")); }

    public void setIdade(int i) { this.idade = i; }
    public void setIdade() { this.idade = Integer.parseInt(JOptionPane.showInputDialog(("Nova idade"))); }

    // Getters
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
    public String getTelefone() { return this.telefone; }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nData de nascimento: " + this.nascimento + "\nAltura " + this.altura;
    }
}
