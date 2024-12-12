// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class VetorAK {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo a dimensão do vetor AK
        System.out.print("Informe a dimensão do vetor AK: ");
        int nAK = scanner.nextInt();

        ArrayList<Double> vetorAK = new ArrayList<>();

        // Lendo os elementos do vetor AK
        System.out.println("Informe " + nAK + " elementos do vetor AK (do tipo double):");
        for (int i = 0; i < nAK; i++) {
            vetorAK.add(scanner.nextDouble());
        }

        // Ordenando o vetor AK em ordem crescente
        Collections.sort(vetorAK);

        // Criando o vetor AL com a média entre cada dois elementos do vetor AK
        ArrayList<Double> vetorAL = new ArrayList<>();
        for (int i = 0; i < vetorAK.size() - 1; i++) {
            double media = (vetorAK.get(i) + vetorAK.get(i + 1)) / 2;
            vetorAL.add(media);
        }

        // Exibindo os vetores
        System.out.println("Vetor AK ordenado: " + vetorAK);
        System.out.println("Vetor AL com médias: " + vetorAL);

    }
}