//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o termos incial: ");
        int num = leia.nextInt();
        System.out.print("Digite a qtd de numeros primos:");
        int qtd = leia.nextInt();

        int contador = 0;
        String primos = "";

        while (contador < qtd) {

            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                contador++;
                primos += Integer.toString(num) + " ";
            }

            num++;
        }

        System.out.print(primos);

    }
}