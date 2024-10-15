package Aula08.maiorMenorV2;

import java.util.Scanner;

public class maiorMenorV2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1, n2, n3, n4, n5, maior, menor;

        System.out.println("Digite o primeiro numero");
        n1 = leia.nextInt();

        maior = menor = n1;

        System.out.println("Digite o segundo numero");
        n2 = leia.nextInt();

        if (n2 > maior) {
            maior = n2;
        } 
        if (n2 < menor) {
            menor = n2;
        }

        System.out.println("Digite o terceiro numero");
        n3 = leia.nextInt();

        if (n3 > maior) {
            maior = n3;
        }
        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("Digite o quarto numero");
        n4 = leia.nextInt();

        if (n4 > maior) {
            maior = n4;
        }
        if (n4 < menor) {
            menor = n4;
        }

        System.out.println("Digite o quinto numero");
        n5 = leia.nextInt();

        if (n5 > maior) {
            maior = n5;
        }
        if (n5 < menor) {
            menor = n5;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}