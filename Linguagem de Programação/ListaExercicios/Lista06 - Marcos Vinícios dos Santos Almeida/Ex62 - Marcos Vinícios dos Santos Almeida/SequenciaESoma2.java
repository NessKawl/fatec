//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SequenciaESoma2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos desejada: ");
        int qtdTermos = leia.nextInt();
        
        double soma = 0;
        String operacao = "-";
        for (int i = 1; i <= qtdTermos; i++) {
            int numerador = i * 2;
            int denominador = (i * 2) - 1;
            System.out.print(numerador + "/" + denominador);
            if (i < qtdTermos) {
                System.out.print(" " + operacao + " ");
            }

            if (operacao == "-") {
                operacao = "+";
            } else {
                operacao = "-";
            }

            if (operacao == "+") {
                soma += (double) numerador / denominador;
            } else {
                soma -= (double) numerador / denominador;
            }
        }

        System.out.println("\n\nSoma das frações: " + soma);

    }
}