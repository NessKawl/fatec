package SomaMedia15ValoresWhile;

import java.util.Scanner;

public class SomaMedia15ValoresWhile {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int contador, numero, soma, total;
        double media;

        contador = 0;
        soma = 0;
        total = 2;

        while (contador < total) {
            contador++;

            System.out.print(contador + " - Entre com um numero: ");
            numero = leia.nextInt();

            soma += numero;

        }

        media = (double) soma / total;

        System.out.print("Soma: " + soma);
        System.out.print("A media eh: " + media);

    }
}
