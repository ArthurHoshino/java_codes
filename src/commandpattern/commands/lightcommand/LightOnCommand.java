package commandpattern.commands.lightcommand;
import commandpattern.receiver.Light;
import commandpattern.interfaces.MenuInterface;

public class LightOnCommand implements MenuInterface {
    private Light light;

    public LightOnCommand(Light l) { this.light = l; }

    public void execute() { this.light.on(); }
    public void unexecute() { this.light.off(); }
}
