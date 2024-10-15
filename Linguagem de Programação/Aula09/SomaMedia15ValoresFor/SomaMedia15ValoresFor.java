package SomaMedia15ValoresFor;

import java.util.Scanner;

public class SomaMedia15ValoresFor {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, soma, total;
        double media;

        soma = 0;
        total = 2;

        for (int contador = 1; contador <= total; contador++) {

            System.out.print(contador + " - Entre com um numero: ");
            numero = leia.nextInt();

            soma += numero;
        }

        media = (double) soma / total;

        System.out.println("Soma: " + soma);
        System.out.print("A media eh: " + media);

    }
}
