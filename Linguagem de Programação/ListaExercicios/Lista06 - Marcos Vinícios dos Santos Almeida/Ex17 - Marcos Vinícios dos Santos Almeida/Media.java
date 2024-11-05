// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1, n2, media, continuar;

        do {
            System.out.print("Digite a nota 1: ");
            n1 = leia.nextInt();

            System.out.print("Digite a nota 2: ");
            n2 = leia.nextInt();

            if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {
                media = (n1 + n2) / 2;
                System.out.println("MEDIA: " + media);

                
            } else {
                System.out.println("Digite valores válidos!");
            }

            System.out.print("NOVO CÁLCULO (Zero p/ não)?");
            continuar = leia.nextInt();

        } while (continuar != 0);

    }
}