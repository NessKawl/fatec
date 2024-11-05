// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class InteiroEntre1eN {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;

        do {
            System.out.print("\n Digite um número [zero p/ sair]: ");
            numero = leia.nextInt();

            for (int contador = 1; contador <= numero; contador++) {
                System.out.print(contador + " ");
            }
        } while (numero != 0);

    }
}