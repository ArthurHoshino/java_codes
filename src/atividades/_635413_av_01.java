package atividades;
import java.util.Scanner;

public class _635413_av_01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[][] a = new int[5][5], b = new int[5][5];
        int x, verif;

        System.out.println("Matrix A\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Posicao (%d:%d): ", (i + 1), (j + 1));
                a[i][j] = scn.nextInt();
            }
        }

        System.out.println("Informe um numero qualquer: ");
        x = scn.nextInt();
        verif = x % 2;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[i][j] % 2 == verif) b[i][j] = a[i][j] * x;
                else b[i][j] = a[i][j];
            }
        }

        System.out.println("\nMatrix A");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("\nMatrix B");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.print("\n");
        }

        scn.close();
    }
}
