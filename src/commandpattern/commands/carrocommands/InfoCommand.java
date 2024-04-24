package commandpattern.commands.carrocommands;
import commandpattern.interfaces.MenuInterface;
import commandpattern.receiver.Carro;

public class InfoCommand implements MenuInterface {
    private Carro carro;

    public InfoCommand(Carro c) { this.carro = c; }

    public void execute() { this.carro.mostrarInfo(); }
    public void unexecute() { this.carro.mostrarInfo(); };
}
