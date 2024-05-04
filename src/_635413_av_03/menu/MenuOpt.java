package _635413_av_03.menu;
import javax.swing.JOptionPane;

public class MenuOpt {
    private String[] options;

    public MenuOpt(String[] opt) { this.options = opt; }

    // Getters
    public String[] getOptions() { return this.options; }

    // Setters
    public void setOptions(String[] opt) { this.options = opt;}

    public int getOptIndex(String opt) {
        return Integer.parseInt(String.valueOf(opt.charAt(0)));
    }
    public int getOptDoubleIndex(String opt) {
        return Integer.parseInt(opt.substring(0, 2));
    }

    public String menu() {
        String retorno;

        retorno = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao",
            null, JOptionPane.QUESTION_MESSAGE, null, this.options, this.options[0]);

        return retorno;
    }
}
