package commandpattern.invoker;
import commandpattern.interfaces.MenuInterface;

public class LightInvoker {
    private MenuInterface on;
    private MenuInterface off;
    private MenuInterface dimUp;
    private MenuInterface dimDown;

    public LightInvoker(
        MenuInterface on,
        MenuInterface off,
        MenuInterface dimUp,
        MenuInterface dimDown
    ) {
        this.on = on;
        this.off = off;
        this.dimUp = dimUp;
        this.dimDown = dimDown;
    }

    public void clickOn() { this.on.execute(); }
    public void clickOff() { this.off.execute(); }
    public void clickDimUp() { this.dimUp.execute(); }
    public void clickDimDown() { this.dimDown.execute(); }
}
