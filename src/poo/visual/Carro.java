package poo.visual;
import javax.swing.JOptionPane;

public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private float velocidade;

    public Carro(String nome, String marca, int ano, float velocidade) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    public Carro() { this("Carro", "Marca", 0, 0); }

    // Getters
    public String getNome() { return this.nome; }
    public String getMarca() { return this.marca; }
    public int getAno() { return this.ano; }
    public float getVelocidade() { return this.velocidade; }

    // Setters
    public void setNome(String n) { this.nome = n; }
    public void setMarca (String m) { this.marca = m; }
    public void setAno (int a) { this.ano = a; }
    public void acelerar(float vel) { this.velocidade += vel; }
    public void freiar (float vel) { this.velocidade -= vel; }
    public void buzinar() { JOptionPane.showMessageDialog(null, "Fon Fon!"); }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nMarca: " + this.marca + "\nAno: " + this.ano + "\nVelocidade: " + this.velocidade + "Km/h";
    }
}
