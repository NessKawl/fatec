// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class VetorY {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a quantidade de elementos da sequência de fatoriais
        System.out.print("Digite a quantidade de elementos da sequência de fatoriais (N <= 15): ");
        int n = scanner.nextInt();

        // Verificar se N está dentro do limite permitido
        if (n <= 0 || n > 15) {
            System.out.println("O valor de N deve ser maior que 0 e menor ou igual a 15.");
            return;
        }

        // Criar o vetor para armazenar os fatoriais
        long[] fatoriais = new long[n];

        // Gerar a sequência de fatoriais
        for (int i = 0; i < n; i++) {
            fatoriais[i] = calcularFatorial(i);
        }

        // Imprimir o vetor
        System.out.print("Vetor Fatoriais: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fatoriais[i] + (i < n - 1 ? ", " : "\n"));
        }

        scanner.close();
    }

    // Método para calcular o fatorial de um número
    private static long calcularFatorial(int num) {
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}