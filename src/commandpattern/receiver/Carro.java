package commandpattern.receiver;
import javax.swing.JOptionPane;

public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private float velocidade;

    private String antNome;
    private String antMarca;
    private int antAno;
    private float antVelocidade;

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
    // public void setNome(String n) {
    //     this.nome = n;
    //     this.antNome = n;
    // }
    // public void setMarca (String m) {
    //     this.marca = m;
    //     this.antMarca = m;
    // }
    // public void setAno (int a) {
    //     this.ano = a;
    //     this.antAno = a;
    // }
    // public void acelerar(float vel) {
    //     this.velocidade += vel;
    //     this.antVelocidade = vel;
    // }
    // public void freiar (float vel) {
    //     this.velocidade -= vel;
    //     this.antVelocidade = vel;
    // }
    public void setNome() {
        this.nome = JOptionPane.showInputDialog("Qual o NOME do veiculo? ");
        this.antNome = this.nome;
    }
    public void setMarca() {
        this.marca = JOptionPane.showInputDialog("Qual a MARCA do veiculo? ");
        this.antMarca = this.marca;
    }
    public void setAno() {
        this.ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ANO do veiculo? "));
        this.antAno = this.ano;
    }
    public void acelerar() {
        this.velocidade += Float.parseFloat(JOptionPane.showInputDialog("Qual a VELOCIDADE? "));
        this.antVelocidade = this.velocidade;
    }
    public void freiar() {
        this.velocidade -= Float.parseFloat(JOptionPane.showInputDialog("Qual a VELOCIDADE? "));
        this.antVelocidade = this.velocidade;
    }
    public void buzinar() { JOptionPane.showMessageDialog(null, "Fon Fon!"); }

    // Unexecute Setters
    public void antSetNome() {
        String tmp = this.nome;
        this.nome = this.antNome;
        this.antNome = tmp;
    }
    public void antSetMarca() {
        String tmp = this.marca;
        this.marca = this.antMarca;
        this.antMarca = tmp;
    }
    public void antSetAno() {
        int tmp = this.ano;
        this.ano = this.antAno;
        this.antAno = tmp;
    }
    public void antAcelerar() {
        this.velocidade -= this.antVelocidade;
    }
    public void antFreiar() {
        this.velocidade += this.antVelocidade;
    }

    public void mostrarInfo() {
        String message = "Nome: " + this.nome + "\nMarca: " + this.marca + "\nAno: " + this.ano + "\nVelocidade: " + this.velocidade + "Km/h";
        JOptionPane.showMessageDialog(null, message);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nMarca: " + this.marca + "\nAno: " + this.ano + "\nVelocidade: " + this.velocidade + "Km/h";
    }
}
