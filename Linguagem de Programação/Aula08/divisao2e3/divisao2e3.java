package Aula08.divisao2e3;

import java.util.Scanner;

public class divisao2e3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1, n2, n3, n4, divisivel;

        divisivel = 0;

        System.out.println("Digite o primeiro numero");
        n1 = leia.nextInt();

        if (n1 % 2 == 0 && n1 % 3 == 0) {
            System.out.print("É divisívei por 2 e 3");
        }

        System.out.println("Digite o segundo numero");
        n2 = leia.nextInt();

        if (n2 % 2 == 0 && n2 % 3 == 0) {
            System.out.println("É divisívei por 2 e 3");
        }

        System.out.println("Digite o terceiro numero");
        n3 = leia.nextInt();

        if (n3 % 2 == 0 && n3 % 3 == 0) {
            System.out.println("É divisívei por 2 e 3");
        }

        System.out.println("Digite o quarto numero");
        n4 = leia.nextInt();

        if (n4 % 2 == 0 && n4 % 3 == 0) {
            System.out.println("É divisívei por 2 e 3");
        }

    }
}