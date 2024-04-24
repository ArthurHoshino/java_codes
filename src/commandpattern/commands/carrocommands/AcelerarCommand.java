package commandpattern.commands.carrocommands;
import commandpattern.receiver.Carro;
import commandpattern.interfaces.MenuInterface;

public class AcelerarCommand implements MenuInterface {
    private Carro carro;

    public AcelerarCommand(Carro c) { this.carro = c; }
    
    public void execute() { this.carro.acelerar(); };
    public void unexecute() { this.carro.antAcelerar(); };
}
