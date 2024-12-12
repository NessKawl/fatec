// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VetorV {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a quantidade de elementos da sequência de Fibonacci
        System.out.print("Digite a quantidade de elementos da sequência de Fibonacci (N <= 20): ");
        int n = scanner.nextInt();

        // Verificar se N está dentro do limite permitido
        if (n <= 0 || n > 20) {
            System.out.println("O valor de N deve ser maior que 0 e menor ou igual a 20.");
            return;
        }

        // Criar o vetor para armazenar a sequência de Fibonacci
        int[] fibonacci = new int[n];

        // Gerar a sequência de Fibonacci
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = 0; // Primeiro elemento é 0
            } else if (i == 1) {
                fibonacci[i] = 1; // Segundo elemento é 1
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Soma dos dois anteriores
            }
        }

        // Imprimir o vetor
        System.out.print("Vetor Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + (i < n - 1 ? ", " : "\n"));
        }
    }
}