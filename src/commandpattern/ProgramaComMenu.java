package commandpattern;

import commandpattern.invoker.LightInvoker;
import commandpattern.receiver.Light;
import commandpattern.commands.lightcommand.*;
import commandpattern.choices.AllChoices;

public class ProgramaComMenu {
    private static String[] choices = AllChoices.choices;
    private static String[] carroChoices = AllChoices.carroChoices;

    public static void main(String[] args) {
        Light l = new Light();
        LightInvoker i = new LightInvoker(new LightOnCommand(l), new LightOffCommand(l), new LightDimUpCommand(l), new LightDimDownCommand(l));

        System.out.println(l);
        
        System.out.println("Teste para ligar");
        i.clickOn();
        System.out.println(l);

        System.out.println("Teste para desligar");
        i.clickOff();
        System.out.println(l);

        System.out.println("Teste para aumentar luminosidade");
        i.clickDimUp();
        System.out.println(l);

        System.out.println("Teste para diminuir a luminosidade");
        i.clickDimDown();
        System.out.println(l);



        // int opt = 0;
        // MenuGenerico menu = new MenuGenerico(choices, "Escolha o que quer criar"),
        //     carroMenu = new MenuGenerico(carroChoices, "Escolha uma acao");
        // HashMap<String, MenuGenerico> menus = new HashMap<String, MenuGenerico>();
        
        // menus.put("menu", menu);
        // menus.put("carroMenu", carroMenu);

        // OpcaoGenerico opcao = new OpcaoGenerico();
        // opcao.adicionarMenuMultiplo(menus);

        // do {
        //     opt = menu.menu();
        //     opcao.opcao(opt);
        // } while (opt != 0);
    }
}
