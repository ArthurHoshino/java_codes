package commandpattern.menu;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class OpcaoGenerico {
    private HashMap<String, MenuGenerico> menus;

    public OpcaoGenerico(HashMap<String, MenuGenerico> m) {
        this.menus = m;
    }
}
