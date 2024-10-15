package Aula08.parImpar;

import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int n1 = leia.nextInt();

        if (n1 % 2 == 0) {
            System.out.print("O numero: " + n1 + " é PAR");
        } else {
            System.out.print("O numero: " + n1 + " é ÍMPAR");

        }

    }
}