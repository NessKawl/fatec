// Marcos Vinícios dos Santos Almeida

import java.util.Arrays;
import java.util.Scanner;

public class VetorAB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar o vetor AB de 10 posições
        int[] ab = new int[10];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite 10 números para preencher o vetor AB:");
        for (int i = 0; i < ab.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            ab[i] = scanner.nextInt();
        }

        // Processar o vetor para transformar ímpares em pares multiplicando por 2
        for (int i = 0; i < ab.length; i++) {
            if (ab[i] % 2 != 0) {
                ab[i] *= 2;
            }
        }

        // Imprimir o vetor resultante
        System.out.print("Vetor AB transformado: ");
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i] + (i < ab.length - 1 ? ", " : "\n"));
        }

    }
}