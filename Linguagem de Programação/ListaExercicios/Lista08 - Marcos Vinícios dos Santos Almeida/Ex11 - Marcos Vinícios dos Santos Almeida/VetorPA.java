// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VetorPA {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int pa[] = new int[5];
        int pb[] = new int[5];
        int pc[] = new int[10];

        int contador = 0;

        while (contador < 5) {

            System.out.print("Digite um numero: ");
            int nVetor = leia.nextInt();

            pa[contador] = nVetor;
            pb[contador] = pa[contador] * 2;

            contador++;

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < 5) {
                    pc[i] = pa[j];
                } else {
                    pc[i] = pb[j];
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(pc[i]);
        }

    }
}