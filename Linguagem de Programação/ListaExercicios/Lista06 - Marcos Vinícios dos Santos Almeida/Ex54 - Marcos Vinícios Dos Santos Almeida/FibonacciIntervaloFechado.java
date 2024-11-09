//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class FibonacciIntervaloFechado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o termo inicial e o termo final ao usuário
        System.out.print("Digite o termo inicial da sequência de Fibonacci: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o termo final da sequência de Fibonacci: ");
        int fim = scanner.nextInt();

        // Validação de entrada
        if (inicio < 0 || fim < 0 || inicio > fim) {
            System.out.println(
                    "Intervalo inválido. O termo inicial deve ser menor ou igual ao termo final e ambos devem ser maiores ou iguais a 0.");
            return;
        }

        System.out.println("Sequência de Fibonacci no intervalo [" + inicio + ", " + fim + "]:");
        // Função para calcular e imprimir a sequência de Fibonacci dentro do intervalo
        // fornecido
        int a = 0, b = 1, c;
        int contador = 1;
        String saida = "";
        
        while (contador <= fim) {
            saida = "";
            if (contador >= inicio) {
                saida += a + " ";
                System.out.print(saida);
            }
            c = a + b;
            a = b;
            b = c;
            contador++;
        }
    }

}
