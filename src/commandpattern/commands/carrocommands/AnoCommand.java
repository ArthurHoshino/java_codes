package commandpattern.commands.carrocommands;
import commandpattern.receiver.Carro;
import commandpattern.interfaces.MenuInterface;

public class AnoCommand implements MenuInterface {
    private Carro carro;

    public AnoCommand(Carro c) { this.carro = c; }
    
    public void execute() { this.carro.setAno(); };
    public void unexecute() { this.carro.antSetAno(); };
}
