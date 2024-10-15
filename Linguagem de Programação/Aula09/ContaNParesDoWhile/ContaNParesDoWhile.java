package ContaNParesDoWhile;

import java.util.Scanner;

public class ContaNParesDoWhile {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero, contador;

        contador = 0;

        System.out.println("Digite 0 para para sair");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            if (numero % 2 == 0 && numero != 0) {
                contador++;
            }

        } while (numero != 0);

        System.out.print("O número de pares eh: " + contador);

    }

}
