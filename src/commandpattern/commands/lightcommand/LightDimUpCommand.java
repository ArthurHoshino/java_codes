package commandpattern.commands.lightcommand;
import commandpattern.receiver.Light;
import commandpattern.interfaces.MenuInterface;

public class LightDimUpCommand implements MenuInterface {
    private Light light;

    public LightDimUpCommand(Light l) { this.light = l; }

    public void execute() { this.light.up(); }
    public void unexecute() { this.light.down(); }
}
