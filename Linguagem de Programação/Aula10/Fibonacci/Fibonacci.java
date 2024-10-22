package Aula10.Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int termos, numero, a, b, c;

        String saida;

        do {
            System.out.print("Entre com a quantidade de termos: ");
            termos = leia.nextInt();

            a = 0;
            b = 1;
            saida = "";

            if (termos > 0) {
                for (int contador = 1; contador <= termos; contador++) {
                    saida += a + " ";

                    c = a + b;
                    a = b;
                    b = c;
                }

                System.out.println("Sequencia: " + saida);

            } else {
                if (termos < 0) {
                    System.out.println("\nQuanitade iválida!!");
                } else {
                    System.out.println("\nFim do programa!!");
                }
            }

        } while (termos > 0);

    }

}