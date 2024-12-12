// Marcos Vinícios dos Santos Almeida

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class VetorAG {

   // Função para verificar se um número é primo
   public static boolean ehPrimo(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lendo a dimensão do vetor
    System.out.print("Informe a dimensão do vetor: ");
    int n = scanner.nextInt();

    ArrayList<Integer> vetor = new ArrayList<>();

    // Lendo os elementos do vetor
    System.out.println("Informe " + n + " elementos para o vetor:");
    for (int i = 0; i < n; i++) {
        vetor.add(scanner.nextInt());
    }

    // Filtrando os números primos
    ArrayList<Integer> primos = new ArrayList<>();
    for (int num : vetor) {
        if (ehPrimo(num)) {
            primos.add(num);
        }
    }

    // Ordenando os números primos em ordem crescente
    Collections.sort(primos);

    // Imprimindo o vetor ordenado
    System.out.println("Vetor ordenado com números primos: " + primos);

    }
}