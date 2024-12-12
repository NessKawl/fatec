// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VetorAH {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição da dimensão mínima do vetor AH
        int minDimensaoAH = 25;

        // Lendo a dimensão do vetor AH
        System.out.print("Informe a dimensão do vetor AH (mínimo " + minDimensaoAH + "): ");
        int nAH = scanner.nextInt();

        // Garantindo que a dimensão seja maior ou igual a 25
        while (nAH < minDimensaoAH) {
            System.out.print("A dimensão deve ser pelo menos " + minDimensaoAH + ". Informe novamente: ");
            nAH = scanner.nextInt();
        }

        ArrayList<Integer> vetorAH = new ArrayList<>();

        // Lendo os elementos do vetor AH
        System.out.println("Informe " + nAH + " elementos para o vetor AH:");
        for (int i = 0; i < nAH; i++) {
            vetorAH.add(scanner.nextInt());
        }

        // Definição da dimensão do vetor AI
        int minDimensaoAI = 2;
        int maxDimensaoAI = 5;

        // Lendo a dimensão do vetor AI
        System.out.print("Informe a dimensão do vetor AI (2 <= N <= 5): ");
        int nAI = scanner.nextInt();

        // Garantindo que a dimensão esteja dentro do intervalo permitido
        while (nAI < minDimensaoAI || nAI > maxDimensaoAI) {
            System.out.print("A dimensão deve estar entre " + minDimensaoAI + " e " + maxDimensaoAI + ". Informe novamente: ");
            nAI = scanner.nextInt();
        }

        ArrayList<Integer> vetorAI = new ArrayList<>();

        // Gerando elementos aleatórios para o vetor AI
        System.out.println("Gerando " + nAI + " elementos para o vetor AI:");
        for (int i = 0; i < nAI; i++) {
            vetorAI.add((int) (Math.random() * 100)); // Elementos aleatórios entre 0 e 99
        }

        // Verificando se o vetor AI está contido no vetor AH
        int posicaoInicial = -1;
        for (int i = 0; i <= nAH - nAI; i++) {
            if (vetorAH.subList(i, i + nAI).equals(vetorAI)) {
                posicaoInicial = i;
                break;
            }
        }

        // Informando o resultado
        if (posicaoInicial == -1) {
            System.out.println("Erro: O vetor AI não está contido no vetor AH.");
        } else {
            System.out.println("Vetor AI está contido no vetor AH a partir da posição: " + posicaoInicial);
        }
    }
}