package Aula10.PositivoMaiorMenor;

import java.util.Scanner;

public class PositivioMaiorMenor {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num, maior = 0, menor = 0, contador = 1;
        do {
            System.out.print("Digite um número: ");
            num = leia.nextInt();

            if (contador == 1) {
                maior = menor = num;
                contador++;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num >= 0) {
                    menor = num;

                }
            }

        } while (num >= 0);

        System.out.print("Maior: " + maior + "\nMenor: " + menor);
    }
}
