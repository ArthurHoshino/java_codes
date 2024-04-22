package poo.visual;
import javax.swing.JOptionPane;

public class CaixaDeDialogo {
    public static void pegarNome() {
        String nome = JOptionPane.showInputDialog("Qual o seu nome? ");;
        int resposta = JOptionPane.showConfirmDialog(null, "Seu nome eh '" + nome + "'?");

        if (resposta == JOptionPane.YES_OPTION) JOptionPane.showMessageDialog(null, "Nome Correto!");
        else JOptionPane.showMessageDialog(null, "Nome incorreto");
    }

    public static void main(String[] args) {
        pegarNome();

    }
}
