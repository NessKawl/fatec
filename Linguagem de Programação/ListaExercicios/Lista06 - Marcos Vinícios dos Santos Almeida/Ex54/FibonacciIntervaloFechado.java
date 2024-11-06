//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class FibonacciIntervaloFechado {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int inicio, termino, a, b, c;
        String saida;
        do {
            System.out.print("Digite o termo inicial Fibonacci: ");
            inicio = leia.nextInt();
            System.out.print("Digite o termo final Fibonacci: ");
            termino = leia.nextInt();

            a = inicio;
            b = 1;
            saida = "";

            if (inicio > 0) {
                for (int i = 0; i < inicio; i++) {
                    saida += a + " ";

                    c = a + b;
                    a = b;
                    b = c;

                }
                System.out.println(saida);

            }

        } while (inicio > 0);

    }
}