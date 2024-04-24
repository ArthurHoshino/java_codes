package commandpattern;
public class SalvarFuncao {
    public void adicionarMenuUnico(MenuGenerico m) {
        this.menu = m;
    }
    public void adicionarMenuMultiplo(HashMap<String, MenuGenerico> m) {
        this.menuTeste = m;
    }

    public void criarFuncionario() {
        Funcionario f = new Funcionario();

        f.setSalario(50);
        System.out.println(f.getSalario());
    }

    public void criarAnalista() {
        Analista a = new Analista();

        a.setSalario(60);
        System.out.println(a.getSalario());
    }

    public void criarConta() {
        Conta c = new Conta("123456789", 0);
        
        c.credito(5000);
        System.out.println(c.saldo);

        c.debito(100);
        System.out.println(c.saldo);

        System.out.println("\n<=== Dados da conta ===>\nNumero: " + c.numero + "\nSaldo: " + c.saldo);
    }

    public void criarInterruptor() {
        Lampada l = new Lampada("LED");
        l.setPotencia(40);
        System.out.println(l);

        Interruptor i = new Interruptor();
        i.conectar(l);
        System.out.println(i);

        i.ligar();
        System.out.println(l);

        i.desligar();
        System.out.println(l);
    }

    public void criarCarro(MenuGenerico menu) {
        Carro c = new Carro();
        int opt = 0, ano;
        float vel;
        String nomeMarca;

        do {
            opt = menu.menu();

            switch (opt) {
                case 0:
                    break;
                case 1:
                    nomeMarca = JOptionPane.showInputDialog(null, "Informe o nome do carro");
                    c.setNome(nomeMarca);
                    break;
                case 2:
                    nomeMarca = JOptionPane.showInputDialog(null, "Informe a marca do carro");
                    c.setMarca(nomeMarca);
                    break;
                case 3:
                    ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano do carro"));
                    c.setAno(ano);
                    break;
                case 4:
                    vel = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a velocidade"));
                    c.acelerar(vel);
                    break;
                case 5:
                    vel = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a velocidade"));
                    c.freiar(vel);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, c);
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while (opt != 0);
    }

    public void criarPessoa() {
        Pessoa p = new Pessoa("Francisco", 16, "91234-5678", "12/12/2012", 180);
        System.out.println(p);
    }
}
