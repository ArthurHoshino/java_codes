package commandpattern;

import commandpattern.invoker.*;
import commandpattern.receiver.*;
import commandpattern.choices.AllChoices;
import commandpattern.menu.*;

import commandpattern.commands.carrocommands.*;
// import commandpattern.commands.lightcommand.*;

public class ProgramaComMenu {
    public static void main(String[] args) {
        int opt = 0;
        MenuGenerico carroMenu = new MenuGenerico(AllChoices.carroChoices, "Escolha uma acao");

        Carro c = new Carro();
        CarroInvoker carro = new CarroInvoker(
            new NomeCommand(c),
            new MarcaCommand(c),
            new AnoCommand(c),
            new AcelerarCommand(c),
            new FreiarCommand(c),
            new InfoCommand(c)
        );

        OpcaoCarro opcao = new OpcaoCarro(carro);

        do {
            opt = carroMenu.menu();
            opcao.option(opt);
        } while (opt != 0);
    }
}
