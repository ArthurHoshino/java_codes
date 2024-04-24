package commandpattern.menu;
import commandpattern.invoker.CarroInvoker;

public class OpcaoCarro {
    private CarroInvoker carro;

    public OpcaoCarro(CarroInvoker c) { this.carro = c; }

    public void option(int index) { this.carro.opcao(index); }
}
