package commandpattern.commands.carrocommands;
import commandpattern.receiver.Carro;
import commandpattern.interfaces.MenuInterface;

public class MarcaCommand implements MenuInterface {
    private Carro carro;

    public MarcaCommand(Carro c) { this.carro = c; }
    
    public void execute() { this.carro.setMarca(); };
    public void unexecute() { this.carro.antSetMarca(); };
}
