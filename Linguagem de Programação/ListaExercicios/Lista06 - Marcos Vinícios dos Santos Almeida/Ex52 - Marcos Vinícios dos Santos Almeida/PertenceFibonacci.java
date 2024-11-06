//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class PertenceFibonacci {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int termos, a, b, c;
        String saida;
        do {
            System.out.print("Digite o termos Fibonacci: ");
            termos = leia.nextInt();

            a = 0;
            b = 1;
            saida = "";

            if (termos > 0) {
                for (int i = 0; i < termos; i++) {
                    saida += a + " ";

                    c = a + b;
                    a = b;
                    b = c;

                    if (termos == a) {
                        System.out.println(termos + " Pertence a sequencia!");
                    } 
                }
                System.out.println(saida);

            }

        } while (termos > 0);

    }
}