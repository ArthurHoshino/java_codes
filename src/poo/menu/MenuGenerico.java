package poo.menu;
import javax.swing.JOptionPane;

public class MenuGenerico {
    private String[] choices;
    private String titulo;

    public MenuGenerico(String[] c, String t) {
        this.choices = c;
        this.titulo = t;
    }

    // GETTERS
    public String[] getChoices() {
        return this.choices;
    }

    public int menu() {
        int opt;
        String retorno;

        retorno = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao",
            this.titulo, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
        
        if (retorno != null) opt = Integer.parseInt(String.valueOf(retorno.charAt(0)));
        else opt = 0;

        return opt;
    }
}
