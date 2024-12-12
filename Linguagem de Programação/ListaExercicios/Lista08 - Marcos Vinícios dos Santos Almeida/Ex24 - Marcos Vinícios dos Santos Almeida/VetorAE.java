// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VetorAE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de posições do vetor AE
        System.out.print("Digite o número de posições do vetor AE: ");
        int n = scanner.nextInt();

        // Validar o número de posições
        if (n <= 0) {
            System.out.println("O número de posições deve ser maior que 0.");
            return;
        }

        // Criar o vetor AE
        int[] ae = new int[n];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite os elementos do vetor AE:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            ae[i] = scanner.nextInt();
        }

        // Criar uma lista para armazenar os números ímpares
        ArrayList<Integer> impares = new ArrayList<>();

        // Adicionar apenas os elementos ímpares à lista
        for (int num : ae) {
            if (num % 2 != 0) {
                impares.add(num);
            }
        }

        // Ordenar os ímpares em ordem decrescente
        impares.sort(Collections.reverseOrder());

        // Substituir os elementos ímpares no vetor original pela ordem decrescente
        int indexImpar = 0;
        for (int i = 0; i < ae.length; i++) {
            if (ae[i] % 2 != 0) {
                ae[i] = impares.get(indexImpar);
                indexImpar++;
            }
        }

        // Imprimir o vetor AE ordenado
        System.out.print("Vetor AE ordenado (ímpares em ordem decrescente): ");
        for (int i = 0; i < ae.length; i++) {
            System.out.print(ae[i] + (i < ae.length - 1 ? ", " : "\n"));
        }

    }
}