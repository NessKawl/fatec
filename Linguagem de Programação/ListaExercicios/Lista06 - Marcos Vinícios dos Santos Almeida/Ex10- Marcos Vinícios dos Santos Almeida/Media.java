// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, media, total = 0;

        for (int contador = 1; contador <= 10; contador++) {
            System.out.print(contador + " - Digite um número: ");
            numero = leia.nextInt();
            
            total += numero;
        }

        media = total / 10;
        System.out.print("Média: " + media);

    }
}