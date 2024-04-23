package commandpattern.commands.lightcommand;
import commandpattern.receiver.Light;
import commandpattern.interfaces.MenuInterface;

public class LightDimDownCommand implements MenuInterface {
    private Light light;

    public LightDimDownCommand(Light l) { this.light = l; }

    public void execute() { this.light.down(); }
    public void unexecute() { this.light.up(); }
}
