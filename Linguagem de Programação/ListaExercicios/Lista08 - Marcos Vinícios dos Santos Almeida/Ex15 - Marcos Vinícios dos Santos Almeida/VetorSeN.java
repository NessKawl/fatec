// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VetorSeN {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int s[] = new int[10];
        int t[] = new int[15];
        int u[] = new int[25];

        int contador1 = 0;

        while (contador1 < 10) {
            
            System.out.print("Digite um número: ");
            int nVetor = leia.nextInt();

            s[contador1] = nVetor;

            contador1++;
        }

        for (int i = 0; i < 10; i++){
            System.out.print(s[i] + " ");
            u[i] = s[i];
        }

        int contador2 = 0;

        while (contador2 < 15) {
            
            System.out.print("Digite um numero (2 vetor): ");
            int nVetor = leia.nextInt();

            t[contador2] = nVetor;

            contador2++;
        }

        for (int i = 0; i < 15; i++){
            System.out.print(t[i] + " ");
        }
        
        for (int i = 10; i < 14; i++) {
            for (int j = 0; j < 15; j++) {
                u[i] = t[j];
            }
        }
        
        System.out.println(" ");

        for (int i = 0; i < 25; i++) {
            System.out.print(u[i] + " ");
        }

    }
}