// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Macas {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int nMacas = leia.nextInt();

        double preco = 0.0;

        if (nMacas < 12) {
            preco = nMacas * 1.3;
        } else {
            preco = nMacas * 1.0;
        }

        System.out.print(nMacas + " Maçãs: R$" + preco);

    }
}