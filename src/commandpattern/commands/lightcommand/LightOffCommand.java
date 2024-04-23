package commandpattern.commands.lightcommand;
import commandpattern.receiver.Light;
import commandpattern.interfaces.MenuInterface;

public class LightOffCommand implements MenuInterface {
    private Light light;

    public LightOffCommand(Light l) { this.light = l; }

    public void execute() { this.light.off(); }
    public void unexecute() { this.light.on(); }
}
