// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class VetorAJ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definição da dimensão mínima do vetor AJ
        int minDimensaoAJ = 10;

        // Lendo a dimensão do vetor AJ
        System.out.print("Informe a dimensão do vetor AJ (mínimo " + minDimensaoAJ + "): ");
        int nAJ = scanner.nextInt();

        // Garantindo que a dimensão seja maior ou igual a 10
        while (nAJ < minDimensaoAJ) {
            System.out.print("A dimensão deve ser pelo menos " + minDimensaoAJ + ". Informe novamente: ");
            nAJ = scanner.nextInt();
        }

        // Gerando elementos aleatórios e não repetidos
        Random random = new Random();
        HashSet<Integer> numerosGerados = new HashSet<>();
        while (numerosGerados.size() < nAJ) {
            int numero = random.nextInt(Integer.MAX_VALUE); // Número aleatório grande
            numerosGerados.add(numero);
        }

        ArrayList<Integer> vetorAJ = new ArrayList<>(numerosGerados);

        // Ordenando o vetor AJ em ordem crescente
        Collections.sort(vetorAJ);

        // Informando o vetor ordenado
        System.out.println("Vetor AJ ordenado: " + vetorAJ);

        int tentativas = 10;
        boolean encontrado = false;

        // Permitindo ao usuário adivinhar elementos do vetor
        while (tentativas > 0 && !encontrado) {
            System.out.print("Tente adivinhar um elemento do vetor AJ (tentativas restantes: " + tentativas + "): ");
            int elementoUsuario = scanner.nextInt();

            if (vetorAJ.contains(elementoUsuario)) {
                int posicao = vetorAJ.indexOf(elementoUsuario);
                System.out.println("Parabéns! Você acertou o elemento " + elementoUsuario + " na posição " + posicao + ".");
                encontrado = true;
            } else {
                System.out.println("Tente novamente.");
                tentativas--;
            }
        }

        if (!encontrado) {
            System.out.println("Você esgotou todas as tentativas. O vetor AJ era: " + vetorAJ);
        }


    }
}