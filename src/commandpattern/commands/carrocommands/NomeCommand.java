package commandpattern.commands.carrocommands;
import commandpattern.receiver.Carro;
import commandpattern.interfaces.MenuInterface;

public class NomeCommand implements MenuInterface {
    private Carro carro;

    public NomeCommand(Carro c) { this.carro = c; }

    public void execute() { this.carro.setNome(); }
    public void unexecute() { this.carro.antSetNome(); }
}
