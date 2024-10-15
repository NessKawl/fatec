package Soma1a500DoWhile;

public class Soma1a500DoWhile {

    public static void main(String[] args) {

        int soma, numero;
        soma = 0;
        numero = 1;

        do {
            if (numero % 2 == 0) {
                soma += numero;
            }
            numero++;
        } while (numero <= 500);

        System.out.print("Soma dos numeros pares entre 1 e 500: " + soma);

    }

}