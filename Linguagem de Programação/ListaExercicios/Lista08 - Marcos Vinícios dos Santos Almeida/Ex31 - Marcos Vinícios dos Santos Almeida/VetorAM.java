// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class VetorAM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a dimensão do vetor AM
        System.out.print("Informe a dimensão do vetor AM (máximo 10): ");
        int nAM = scanner.nextInt();

        // Garantindo que a dimensão seja <= 10
        while (nAM > 10) {
            System.out.print("A dimensão deve ser menor ou igual a 10. Informe novamente: ");
            nAM = scanner.nextInt();
        }

        scanner.nextLine(); // Limpa o buffer de entrada

        ArrayList<String> vetorAM = new ArrayList<>();

        // Lendo os N valores String para o vetor AM
        System.out.println("Informe " + nAM + " valores para o vetor AM (palavras ou frases):");
        for (int i = 0; i < nAM; i++) {
            vetorAM.add(scanner.nextLine());
        }

        // Imprimindo o vetor AM original
        System.out.println("Vetor AM original: " + vetorAM);

        // Ordenando o vetor AM em ordem crescente
        Collections.sort(vetorAM);

        // Imprimindo o vetor AM ordenado
        System.out.println("Vetor AM ordenado: " + vetorAM);


    }
}