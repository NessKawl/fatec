// Marcos Vinícios dos Santos Almeida

import java.util.Arrays;
import java.util.Scanner;

public class VetorAC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar o número de posições do vetor AC
        System.out.print("Digite o número de posições do vetor AC (N <= 20): ");
        int n = scanner.nextInt();

        // Validar o número de posições
        if (n <= 0 || n > 20) {
            System.out.println("O número de posições deve ser maior que 0 e menor ou igual a 20.");
            return;
        }

        // Solicitar o valor máximo para os elementos do vetor
        System.out.print("Digite o valor máximo permitido para os elementos: ");
        int maxValor = scanner.nextInt();

        if (maxValor <= 0) {
            System.out.println("O valor máximo deve ser maior que 0.");
            return;
        }

        // Criar o vetor AC
        int[] ac = new int[n];

        // Ler os elementos fornecidos pelo usuário
        System.out.println("Digite os elementos do vetor AC:");
        for (int i = 0; i < n; i++) {
            int elemento;
            do {
                System.out.print("Elemento " + (i + 1) + ": ");
                elemento = scanner.nextInt();

                if (elemento < 0 || elemento > maxValor) {
                    System.out.println("O elemento deve estar entre 0 e " + maxValor + ". Tente novamente.");
                }
            } while (elemento < 0 || elemento > maxValor);

            ac[i] = elemento;
        }

        // Imprimir o vetor AC
        System.out.print("Vetor AC: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ac[i] + (i < n - 1 ? ", " : "\n"));
        }


    }
}