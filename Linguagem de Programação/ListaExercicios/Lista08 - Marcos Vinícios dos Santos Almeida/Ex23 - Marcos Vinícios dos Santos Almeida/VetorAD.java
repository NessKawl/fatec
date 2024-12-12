// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VetorAD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de posições do vetor AD
        System.out.print("Digite o número de posições do vetor AD: ");
        int n = scanner.nextInt();

        // Validar o número de posições
        if (n <= 0) {
            System.out.println("O número de posições deve ser maior que 0.");
            return;
        }

        // Criar o vetor AD
        int[] ad = new int[n];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite os elementos do vetor AD:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            ad[i] = scanner.nextInt();
        }

        // Criar uma lista para armazenar os números pares
        ArrayList<Integer> pares = new ArrayList<>();

        // Adicionar apenas os elementos pares à lista
        for (int num : ad) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }

        // Ordenar os pares em ordem crescente
        Collections.sort(pares);

        // Substituir os elementos pares no vetor original pela ordem crescente
        int indexPar = 0;
        for (int i = 0; i < ad.length; i++) {
            if (ad[i] % 2 == 0) {
                ad[i] = pares.get(indexPar);
                indexPar++;
            }
        }

        // Imprimir o vetor AD ordenado
        System.out.print("Vetor AD ordenado (pares em ordem crescente): ");
        for (int i = 0; i < ad.length; i++) {
            System.out.print(ad[i] + (i < ad.length - 1 ? ", " : "\n"));
        }

    }
}