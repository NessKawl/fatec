// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VetorPeQ {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int p[] = new int[10];
        int q[] = new int[15];
        int r[] = new int[25];

        int contador1 = 0, contador2 = 0;
        while (contador1 < 10) {
            System.out.print("Digite um numero: ");
            int nVetor = leia.nextInt();

            p[contador1] = nVetor;
            contador1++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(p[i] + " ");
            r[i] = p[i];
        }

        while (contador2 < 15) {
            System.out.print("\nDigite um numero: ");
            int nVetor = leia.nextInt();

            q[contador2] = nVetor;
            contador2++;
        }

        for (int i = 15; i < 25; i++) {
            for (int j = 0; j < 15; j++) {
                r[i] = q[j];
            }
        }

        for (

                int i = 0; i < 15; i++) {
            System.out.print(q[i] + " ");
        }

        for (int i = 0; i < 25; i++) {
            System.out.print("\n" + r[i] + " ");
        }

    }
}