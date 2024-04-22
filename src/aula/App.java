package aula;
import aula.classes.*;

public class App {
    public static void criarConta() {
        Conta c = new Conta();

        c.setNumero("123.456-7");
        c.setSaldo(600);
        System.out.println(c);

        c.credito(50);
        System.out.println(c);

        c.debito(150);
        System.out.println(c);
    }

    public static void criarTeveEControleRemoto() {
        Televisao t = new Televisao();
        ControleRemoto c = new ControleRemoto(t);

        c.consulta();

        System.out.println("Aumentar o volume em 1");
        c.aumentarV();
        c.consultaV();

        System.out.println("Diminuir o volume em 1");
        c.diminuirV();
        c.consultaV();

        System.out.println("Aumentar o canal em 1");
        c.aumentarC();
        c.consultaC();

        System.out.println("Diminuir o canal em 1");
        c.diminuirC();
        c.consultaC();

        System.out.println("Teste de canal menor que 1");
        c.diminuirC();
        c.consultaC();

        System.out.println("Teste de canal maior que 50");
        c.definirC(50);
        c.aumentarC();
        c.consultaC();

        System.out.println("Teste de volume menor que 1");
        t.setVolume(1);
        c.diminuirV();
        c.consultaV();

        System.out.println("Teste de volume maior que 100");
        t.setVolume(100);
        c.aumentarV();
        c.consultaV();
    }

    public static void main(String[] args) {
        // criarConta();
        criarTeveEControleRemoto();
    }
}
