//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class InversoPrimosAteN {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a qtd de numeros primos:");
        int qtd = leia.nextInt();

        int numero = 2, contador = 0;
        String primos = "";

        while (contador < qtd) {
            boolean primo = true;
            
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                primos += Integer.toString(numero) + " ";
                contador++;
            }

            numero++;
        }

        System.out.printf(new StringBuilder(primos).reverse().toString());

    }
}