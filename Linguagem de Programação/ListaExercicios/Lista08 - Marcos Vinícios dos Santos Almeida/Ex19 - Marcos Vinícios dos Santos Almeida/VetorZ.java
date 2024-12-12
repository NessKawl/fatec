// Marcos Vinícios dos Santos Almeida

import java.util.Arrays;
import java.util.Scanner;

public class VetorZ {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar o vetor Z de 10 posições
        int[] z = new int[10];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite 10 números para preencher o vetor Z:");
        for (int i = 0; i < z.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            z[i] = scanner.nextInt();
        }

        // Ordenar o vetor em ordem crescente
        Arrays.sort(z);

        // Imprimir o vetor ordenado
        System.out.print("Vetor Z ordenado: ");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + (i < z.length - 1 ? ", " : "\n"));
        }

    }
}