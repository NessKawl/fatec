//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Fibonacci1a250 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos = 1, a, b, c;
        String saida;
        do {

            a = 0;
            b = 1;
            saida = "";

            for (int i = 1; a < 250; i++) {
                saida += a + " ";

                c = a + b;
                a = b;
                b = c;

            }
            System.out.println(saida);

        } while (a < 250);

    }
}