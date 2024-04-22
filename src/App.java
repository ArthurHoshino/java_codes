import java.util.Scanner;

public class App {
    static Scanner scn = new Scanner(System.in);

    public static void testeIf(int a) {
        if (a < 0) {
            System.out.println("Preco negativo");
        } else {
            System.out.println("Preco positivo");
        }
    }

    public static void printSequencia() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }

    public static void inputSemScanner() {
        int a;

        System.out.println("Digite um numero: ");
        a = Integer.valueOf(System.console().readLine());
        testeIf(a);
    }

    public static void mostrarMeuNome() {
        String nome = "Arthur Osaka Hoshino";
        System.out.println(nome);
    }

    public static void mostrarMinhasInfos() {
        String nome = "Arthur";
        String telefone = "1234-5678";
        String rua = "Rua de Ninguem";
        int numero = 404;

        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(rua + ", " + numero);
    }

    public static void fibonacci() {
        int anterior = 1, atual = 0, posterior = 0, i, ver;
        int a = 1, b = 1, contador = 0, qtd = 0;
        String r = "";

        System.out.println("Opcoes\n" +
                            "1. Printar Fibonacci\n" +
                            "2. Fibonacci em pares\n" +
                            "3. Fibonacci em array\n" +
                            "4. Fibonacci par ou impar\n");
        ver = scn.nextInt();

        System.out.println("Informe a quantidade de repeticoes: ");
        qtd = scn.nextInt();
        System.out.println("\n");

        switch (ver) {
            case 1:
                for (i = 0; i < qtd; i++) {
                    posterior = anterior + atual;
                    anterior = atual;
                    atual = posterior;
        
                    System.out.println(posterior);
                }
                break;
            case 2:
                for (i = 0; i < qtd; i++) {
                    System.out.println(a);
                    a += b;
                    System.out.println(b);
                    b += a;
                }
                break;
            case 3:
                int[] retorno = new int[qtd];
                for (i = 0; i < qtd; i++) {
                    posterior = anterior + atual;
                    anterior = atual;
                    atual = posterior;
        
                    retorno[i] = posterior;
                    r += posterior + " ";
                }

                System.out.println("Fibonacci: " + r);
                break;
            case 4:
                String aParidade = "Impar: ", bParidade = "Impar: ";

                for (i = 0; i < qtd; i++) {
                    switch (contador) {
                        case 0:
                            aParidade = "Impar: ";
                            bParidade = "Impar: ";
                            contador++;
                            break;
                        case 1:
                            aParidade = "Par: ";
                            bParidade = "Impar: ";
                            contador++;
                            break;
                        default:
                            aParidade = "Impar: ";
                            bParidade = "Par: ";
                            contador = 0;
                            break;
                    }
        
                    System.out.println(aParidade + a);
        
                    a += b;
        
                    System.out.println(bParidade + b);
        
                    b += a;
                }
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }

    }

    public static int fibonacciRecursao(int qtd) {
        // mostrar o valor de x posicao
        if (qtd == 2 || qtd == 1) {
            return 1;
        } else {
            return fibonacciRecursao(qtd - 1) + fibonacciRecursao(qtd - 2);
        }
    }

    public static void switchCase() {
        int cmd = scn.nextInt();

        switch (cmd) {
            case 1:
                System.out.println("Inserir");
                cmd = 2;
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Alterar");
                break;
            case 4:
                System.out.println("Excluir");
                break;
            default:
                System.out.println("Erro!");
                break;
        }

        scn.close();
    }

    public static void testeWhileFor(boolean ver, boolean mode) {
        int contador;

        if (mode) {
            if (ver) {
                contador = 0;
                while (contador < 100) {
                    System.out.println(contador);
                    contador++;
                }
            } else {
                contador = -100;
                while (contador <= 1) {
                    System.out.println(contador);
                    contador++;
                }
            }
        } else {
            if (ver) {
                for (contador = 0; contador < 100; contador++) {
                    System.out.println(contador);
                }
            } else {
                for (contador = -100; contador <= 1; contador++) {
                    System.out.println(contador);
                }
            }
        }
    }

    public static void mostrarPares() {
        for (int contador = 100; contador >= 50; contador -= 2) {
            System.out.println(contador);
        }
    }

    public static void testeString() {
        String teste = "Amigo";
        System.out.println(teste + " Andre!");
        teste += " Andre!";
        System.out.println(teste);
    }

    public static void doWhile() {
        int contador = 0;

        do {
            System.out.println("Menu");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Alterar");
            System.out.println("4. Excluir");
            contador++;
        } while (contador < 5);
    }

    public static void testeScanner() {
        // new: comando reservado para instanciar um obj
        // System.in: parametro construtor da classe
        System.out.println("Opcao:\n" + 
                            "1. Pegar info\n" +
                            "2. Pegar nome, telefone, endereco e numero da casa\n" +
                            "3. Converter tudo em segundos\n" +
                            "4. Calcular reajuste de salario\n" +
                            "5. Combustivel e valor totais gastos\n");
        int ver = scn.nextInt();
        scn.nextLine();

        switch (ver) {
            case 1:
                // pegar informacoes
                System.out.println("Inteiro: ");
                int a = scn.nextInt();
        
                System.out.println("Float: ");
                float b = scn.nextFloat();
        
                System.out.println(a + " " + b);
                break;
            case 2:
                // pegar nome, telefone, rua e numero
                System.out.println("\nNome: ");
                String nome = scn.nextLine();
                
                System.out.println("\nTelefone: ");
                int phone = scn.nextInt();
                
                scn.nextLine();
                
                System.out.println("\nNome da rua: ");
                String rua = scn.nextLine();
        
                System.out.println("\nNumero da casa: ");
                int numCasa = scn.nextInt();
        
                System.out.println("\n" + nome + "\n" + phone + "\n" + rua + ", " + numCasa);
                break;
            case 3:
                // converter tudo em segundos
                int d, h, m, s;

                System.out.println("Dias: ");
                d = scn.nextInt();

                System.out.println("Horas: ");
                h = scn.nextInt();

                System.out.println("Minutos: ");
                m = scn.nextInt();

                System.out.println("Segundos: ");
                s = scn.nextInt();
                
                s += (d * 86400) + (h * 3600) + (m * 60);

                System.out.println("Total de segundos: " + s);
                break;
            case 4:
                // calcular reajuste de salario
                int sal;
                float reaj, newSal;

                System.out.println("Salario: ");
                sal = scn.nextInt();

                System.out.println("Reajuste: ");
                reaj = scn.nextFloat();

                newSal = sal * ((reaj / 100) + 1); 

                System.out.println("Novo salario: " + newSal);
                break;
            case 5:
                // desempenho do carro
                float dist, pComb, desemp, lTotal, pGasto;

                System.out.println("Distancia: ");
                dist = scn.nextFloat();

                System.out.println("Preco combustivel: ");
                pComb = scn.nextFloat();

                System.out.println("Desempenho: ");
                desemp = scn.nextFloat();

                lTotal = dist / desemp;
                pGasto = lTotal * pComb;

                System.out.println("Litros gastos: " + lTotal +
                                    "\nPreco gasto: " + pGasto);
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
        
        scn.close();
    }

    public static void testeArray() {
        // exercicios de array
        int[] a, b;
        int[][] d, e, f;
        int c, i, j, m, n, ver;
        String aList = "", bList = "", fList = "";

        System.out.println("Opcao:\n" + 
                            "1. Somar um valor ao array anterior\n" +
                            "2. Somar duas matrizes quadradas\n" +
                            "3. Mandar um valor e imprimir todos os valores de mesma paridade\n");
        ver = scn.nextInt();

        switch (ver) {
            case 1:
                System.out.println("Informe a dimensao da matriz");
                m = scn.nextInt();
                a = new int[m];
                b = new int[m];

                for (i = 0; i < 10; i++) {
                    System.out.printf("Informe o valor (%d): ", (i + 1));
                    a[i] = scn.nextInt();
                }

                System.out.println("\nInforme um valor para somar aos valores anteriores: ");
                c = scn.nextInt();

                for (i = 0; i < 10; i++) {
                    b[i] = a[i] + c;
                    aList += Integer.toString(a[i]) + " ";
                    bList += Integer.toString(b[i]) + " ";
                }
                
                System.out.println("\nItens de A: " + aList + "\n" + "Itens de B: " + bList);

                break;
            case 2:
                System.out.println("Informe a dimensao da matriz quadrada: ");
                m = scn.nextInt();
                d = new int[m][m];
                e = new int[m][m];
                f = new int[m][m];
                
                System.out.println("Primeiro array\n");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < m; j++) {
                        System.out.printf("Informe um valor (%d : %d): ", (i + 1), (j + 1));
                        d[i][j] = scn.nextInt();
                    }
                }
                System.out.println("Segundo array\n");
                for (i = 0; i < m; i++) {
                    for (j = 0; j < m; j++) {
                        System.out.printf("Informe um valor (%d : %d): ", (i + 1), (j + 1));
                        e[i][j] = scn.nextInt();

                        f[i][j] = d[i][j] + e[i][j];
                        fList += f[i][j] + " ";
                    }
                    fList += "\n";
                }
                System.out.println("\nMatriz somada: " + "\n" + fList);
                break;
            case 3:
                System.out.println("Informe a dimensao da matriz nao quadrada (linha x coluna): ");
                m = scn.nextInt();
                n = scn.nextInt();
                d = new int[m][n];
                
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        System.out.printf("Numero (%d : %d): ", (i + 1), (j + 1));
                        d[i][j] = scn.nextInt();
                    }
                }

                System.out.println("Informe um numero: ");
                c = scn.nextInt() % 2;

                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++) {
                        if (d[i][j] % 2 == c) {
                            System.out.print(d[i][j] + " ");
                        }
                    }
                }
                break;                
            default:
                break;
        }
        scn.close();
    }

    public static void main(String[] args) throws Exception {
        // printSequencia();
        // mostrarMeuNome();
        // mostrarMinhasInfos();
        // fibonacci();
        // System.out.println(fibonacciRecursao(20));
        // switchCase();
        // testeWhileFor(true, true);
        // mostrarPares();
        // testeString();
        // doWhile();
        // testeScanner();
        testeArray();
    }
}
