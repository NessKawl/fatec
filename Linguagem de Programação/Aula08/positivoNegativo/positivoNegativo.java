package Aula08.positivoNegativo;

import java.util.Scanner;

public class positivoNegativo {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1, n2, n3, n4, n5, positivos, negativos, zeros;
        String nomeMaior, nomeMenor;

        positivos = 0;
        negativos = 0;
        zeros = 0;

        System.out.println("Digite o primeiro numero");
        n1 = leia.nextInt();

        if (n1 > 0) {
            positivos++;
        } else {
            if (n1 < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Digite o segundo numero");
        n2 = leia.nextInt();

        if (n2 > 0) {
            positivos++;
        } else {
            if (n2 < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Digite o terceiro numero");
        n3 = leia.nextInt();

        if (n3 > 0) {
            positivos++;
        } else {
            if (n3 < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Digite o quarto numero");
        n4 = leia.nextInt();

        if (n4 > 0) {
            positivos++;
        } else {
            if (n4 < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Digite o quinto numero");
        n5 = leia.nextInt();

        if (n5 > 0) {
            positivos++;
        } else {
            if (n5 < 0) {
                negativos++;
            } else {
                zeros++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Zeros: " + zeros);
    }
}