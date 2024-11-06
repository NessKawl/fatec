//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaESoma3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos desejada: ");
        int qtdTermos = leia.nextInt();

        //FIBONACCI
        int contador = 0, a, b, c;
        String fibonacciSaida;
        int[] fibonacciTermos = new int[qtdTermos];

        fibonacciSaida = "";

        a = 1;
        b = 1;

        if (qtdTermos > 0) {
            for (int i = 0; i < qtdTermos; i++) {
                fibonacciTermos[i] = a;
                fibonacciSaida += a + " ";

                c = a + b;
                a = b;
                b = c;
            }
        }

        // PRIMOS
        int[] primos = new int[qtdTermos];
        int contadorPrimos = 0;
        String primoSaida = "";
        int numero = 2;

        while (contadorPrimos < qtdTermos) {
            boolean primo = true;

            // Verifica se o número é primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break; // Encerra o laço se encontrar um divisor
                }
            }

            // Se o número for primo, imprime-o
            if (primo) {
                primos[contadorPrimos] = numero;
                primoSaida += numero + " ";
                contadorPrimos++;
            }

            numero++;
        }

        //FRAÇÕES
        double soma = 0.0;
        String fracoesSaida = "";

        for (int i = 0; i < qtdTermos; i++) {
            int numerador = fibonacciTermos[i];
            int denominador = primos[i];

            fracoesSaida += numerador + "/" + denominador;

            if (i < qtdTermos - 1) {
                fracoesSaida += " + ";
            }

            soma += (double) numerador / denominador;
        }

        System.out.println(fracoesSaida);
        System.out.print("Soma das frações: " + soma);

    }
}