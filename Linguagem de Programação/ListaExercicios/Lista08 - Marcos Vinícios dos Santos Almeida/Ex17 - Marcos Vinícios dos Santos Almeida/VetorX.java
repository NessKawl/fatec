// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VetorX {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a quantidade de elementos da sequência de números primos
        System.out.print("Digite a quantidade de elementos da sequência de números primos (N <= 20): ");
        int n = scanner.nextInt();

        // Verificar se N está dentro do limite permitido
        if (n <= 0 || n > 20) {
            System.out.println("O valor de N deve ser maior que 0 e menor ou igual a 20.");
            return;
        }

        // Criar o vetor para armazenar os números primos
        int[] primos = new int[n];
        int count = 0; // Contador de números primos encontrados
        int num = 2; // Primeiro número a ser verificado

        // Gerar a sequência de números primos
        while (count < n) {
            if (isPrime(num)) {
                primos[count] = num;
                count++;
            }
            num++;
        }

        // Imprimir o vetor
        System.out.print("Vetor Primos: ");
        for (int i = 0; i < n; i++) {
            System.out.print(primos[i] + (i < n - 1 ? ", " : "\n"));
        }

    }

    // Método para verificar se um número é primo
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}