// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VetorAF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de posições do vetor AF
        System.out.print("Digite o número de posições do vetor AF: ");
        int n = scanner.nextInt();

        // Validar o número de posições
        if (n <= 0) {
            System.out.println("O número de posições deve ser maior que 0.");
            return;
        }

        // Criar o vetor AF
        int[] af = new int[n];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite os elementos do vetor AF:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            af[i] = scanner.nextInt();
        }

        // Criar listas para armazenar os números ímpares e pares
        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        // Separar os números ímpares e pares
        for (int num : af) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        // Ordenar os ímpares em ordem crescente
        Collections.sort(impares);

        // Ordenar os pares em ordem decrescente
        pares.sort(Collections.reverseOrder());

        // Reposicionar os elementos no vetor original
        int indexImpar = 0;
        int indexPar = 0;
        for (int i = 0; i < af.length; i++) {
            if (af[i] % 2 == 0) {
                af[i] = pares.get(indexPar);
                indexPar++;
            } else {
                af[i] = impares.get(indexImpar);
                indexImpar++;
            }
        }

        // Imprimir o vetor AF ordenado
        System.out.print("Vetor AF ordenado (ímpares em ordem crescente, pares em ordem decrescente): ");
        for (int i = 0; i < af.length; i++) {
            System.out.print(af[i] + (i < af.length - 1 ? ", " : "\n"));
        }

    }
}