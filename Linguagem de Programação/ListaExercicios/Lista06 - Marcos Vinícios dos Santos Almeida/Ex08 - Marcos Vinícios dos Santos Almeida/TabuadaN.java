// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class TabuadaN {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, contador, negativos;
        negativos = 0;
        contador = 0;
        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            contador++;

            if (numero < 0) {
                negativos++;
            }

        } while (contador <= 10);

        System.out.println("NEGATIVOS: " + negativos);

    }
}