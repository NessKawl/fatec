// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numreos, total, contador;

        contador = 0;
        total = 0;

        while (contador < 10) {
            System.out.print("Digite um numero: ");
            numreos = leia.nextInt();
            total += numreos;
            contador++;
        }

        System.out.print("Total: " + total);

    }
}