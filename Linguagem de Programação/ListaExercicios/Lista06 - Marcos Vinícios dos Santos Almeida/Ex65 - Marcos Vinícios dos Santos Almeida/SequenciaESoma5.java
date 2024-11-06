//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaESoma5 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos desejada: ");
        int qtdTermos = leia.nextInt();

        // FATORIAL
        int[] fatoriais = new int[qtdTermos];
        String fatoriaisSaida = "";
        int fatorial = 1;

        fatoriais[0] = -1;
        fatoriaisSaida += fatoriais[0] + " ";

        for (int i = 1; i < qtdTermos; i++) {
            fatorial *= i;  // Calcula o fatorial
            fatoriais[i] = fatorial;
            fatoriaisSaida += fatoriais[i] + " ";
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

        // FRAÇÕES
        double soma = 0.0;
        String operacao = "+";
        String fracoesSaida = "";

        for (int i = 0; i < qtdTermos; i++) {
            int numerador = fatoriais[i];
            int denominador = primos[i];

            fracoesSaida += numerador + "/" + denominador;

            if (i < qtdTermos - 1) {
                fracoesSaida += " " + operacao + " ";
            }
            if (operacao == "-") {
                soma += (double) numerador / denominador;
                operacao = "+";
            } else {
                operacao = "-";
                soma -= (double) numerador / denominador;
            }

        }

        System.out.println("\n" + fracoesSaida);
        System.out.print("Soma das frações: " + soma);

    }
}