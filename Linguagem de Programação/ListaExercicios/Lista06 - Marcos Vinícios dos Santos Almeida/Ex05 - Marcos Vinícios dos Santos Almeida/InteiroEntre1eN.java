// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class InteiroEntre1eN {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero;

        System.out.print("\n Digite um número: ");
        numero = leia.nextInt();

        while (numero <= 0) {
            System.out.print("Digite um número válido: ");
            numero = leia.nextInt();
        }
        
        for (int contador = 1; contador <= numero; contador++) {
            System.out.print(contador + " ");
        }

    }
}