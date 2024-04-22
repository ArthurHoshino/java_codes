import java.util.HashMap;
import poo.menu.*;

public class ProgramaComMenu {
    private static String[] choices = {
        "0. Sair",
        "1. Funcionario",
        "2. Analista",
        "3. Conta",
        "4. Interruptor",
        "5. Carro",
        "6. Pessoa",
    };

    private static String[] carroChoices = {
        "0. Sair",
        "1. Nomear/Renomear carro",
        "2. Adicionar marca do carro",
        "3. Adicionar ano",
        "4. Acelerar",
        "5. Freiar",
        "6. Mostrar informacoes",
    };

    public static void main(String[] args) {
        int opt = 0;
        MenuGenerico menu = new MenuGenerico(choices, "Escolha o que quer criar"),
            carroMenu = new MenuGenerico(carroChoices, "Escolha uma acao");
        HashMap<String, MenuGenerico> menus = new HashMap<String, MenuGenerico>();
        
        menus.put("menu", menu);
        menus.put("carroMenu", carroMenu);

        // OpcaoGenerico opcao = new OpcaoGenerico();
        // opcao.adicionarMenuMultiplo(menus);

        do {
            opt = menu.menu();
            // opcao.opcao(opt);
        } while (opt != 0);
    }
}
