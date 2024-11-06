//Marcos Vinício dos Santos Almeida

import java.util.Scanner;

public class Fatorial4 {
    public static void main(String[] args) {
        // Criação do Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de termos da sequência de fatoriais
        System.out.print("Digite a quantidade de termos da sequência de fatoriais: ");
        int numTermos = scanner.nextInt();

        // Calcula e imprime os fatoriais de 1 até numTermos
        for (int i = 1; i <= numTermos; i++) {
            System.out.println(i + "! = " + fatorial(i));
        }

        // Fecha o Scanner
        scanner.close();
    }

    // Função para calcular o fatorial de um número
    public static long fatorial(int n) {
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
