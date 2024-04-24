package commandpattern.invoker;
import commandpattern.interfaces.MenuInterface;

public class CarroInvoker {
    private MenuInterface nome;
    private MenuInterface marca;
    private MenuInterface ano;
    private MenuInterface acelerar;
    private MenuInterface freiar;
    private MenuInterface info;

    public CarroInvoker(
        MenuInterface nome,
        MenuInterface marca,
        MenuInterface ano,
        MenuInterface acelerar,
        MenuInterface freiar,
        MenuInterface info
    ) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.acelerar = acelerar;
        this.freiar = freiar;
        this.info = info;
    }

    public void clickNome() { this.nome.execute(); }
    public void clickMarca() { this.marca.execute(); }
    public void clickAno() { this.ano.execute(); }
    public void clickAcelerar() { this.acelerar.execute(); }
    public void clickFreiar() { this.freiar.execute(); }
    public void clickInfo() { this.info.execute(); }

    interface EscolherOpcao { void opcao(); }

    private EscolherOpcao[] opcoes = new EscolherOpcao[] {
        new EscolherOpcao() { public void opcao() {} },
        new EscolherOpcao() { public void opcao() { clickNome(); } },
        new EscolherOpcao() { public void opcao() { clickMarca(); } },
        new EscolherOpcao() { public void opcao() { clickAno(); } },
        new EscolherOpcao() { public void opcao() { clickAcelerar(); } },
        new EscolherOpcao() { public void opcao() { clickFreiar(); } },
        new EscolherOpcao() { public void opcao() { clickInfo(); } }
    };

    public void opcao(int index) { opcoes[index].opcao(); }
}
