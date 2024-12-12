// Marcos Vinícios dos Santos Almeida

import java.util.Arrays;
import java.util.Scanner;

public class VetorAA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criar o vetor AA de 10 posições
        int[] aa = new int[10];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite 10 números para preencher o vetor AA:");
        for (int i = 0; i < aa.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            aa[i] = scanner.nextInt();
        }

        // Ordenar o vetor em ordem decrescente
        Arrays.sort(aa);
        for (int i = 0; i < aa.length / 2; i++) {
            int temp = aa[i];
            aa[i] = aa[aa.length - 1 - i];
            aa[aa.length - 1 - i] = temp;
        }

        // Imprimir o vetor ordenado em ordem decrescente
        System.out.print("Vetor AA ordenado em ordem decrescente: ");
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + (i < aa.length - 1 ? ", " : "\n"));
        }

    }
}