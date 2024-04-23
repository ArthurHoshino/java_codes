package commandpattern.invoker;
import commandpattern.interfaces.MenuInterface;

public class LightInvokerLista {
    private MenuInterface[] comando;

    public LightInvokerLista(MenuInterface[] c) {
        this.comando = c;
    }
}
