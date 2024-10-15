package SomaMedia15ValoresDoWhile;

import java.util.Scanner;

public class SomaMedia15ValoresDoWhile {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador, numero, soma, total;
        double media;

        contador = 0;
        soma = 0;
        total = 15;

        do {
            contador++;

            System.out.print(contador + " - Entre com um numero: ");
            numero = leia.nextInt();

            soma += numero;

        } while (contador < total);

        media = (double) soma / total;

        System.out.print("Soma: " + soma);
        System.out.print("A media eh: " + media);

    }
}
