package commandpattern.commands.carrocommands;
import commandpattern.receiver.Carro;
import commandpattern.interfaces.MenuInterface;

public class FreiarCommand implements MenuInterface {
    private Carro carro;

    public FreiarCommand(Carro c) { this.carro = c; }
    
    public void execute() { this.carro.freiar(); };
    public void unexecute() { this.carro.antFreiar(); };
}
