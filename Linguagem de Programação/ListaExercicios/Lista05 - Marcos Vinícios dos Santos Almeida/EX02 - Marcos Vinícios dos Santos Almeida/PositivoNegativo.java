// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int valor = leia.nextInt();

        if (valor >= 0) {
            System.out.print(valor + " É POSITIVO");
        } else {
            System.out.print(valor + " É NEGATIVO");
        }

    }
}