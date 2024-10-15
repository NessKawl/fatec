package Aula08.maiorMenorV3;

import java.util.Scanner;

public class maiorMenorV3 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1, n2, n3, n4, n5, maior, menor;
        String nomeMaior, nomeMenor;

        System.out.println("Digite o primeiro numero");
        n1 = leia.nextInt();

        maior = menor = n1;
        nomeMaior = "N1";
        nomeMenor = "N1";

        System.out.println("Digite o segundo numero");
        n2 = leia.nextInt();

        if (n2 > maior) {
            maior = n2;
            nomeMaior = "N2";
        } 
        if (n2 < menor) {
            menor = n2;
            nomeMenor = "N2";
        }

        System.out.println("Digite o terceiro numero");
        n3 = leia.nextInt();

        if (n3 > maior) {
            maior = n3;
            nomeMaior = "N3";
        }
        if (n3 < menor) {
            menor = n3;
            nomeMenor = "N2";
        }

        System.out.println("Digite o quarto numero");
        n4 = leia.nextInt();

        if (n4 > maior) {
            maior = n4;
            nomeMaior = "N4";
        }
        if (n4 < menor) {
            menor = n4;
            nomeMenor = "N2";
        }

        System.out.println("Digite o quinto numero");
        n5 = leia.nextInt();

        if (n5 > maior) {
            maior = n5;
            nomeMaior = "N5";
        }
        if (n5 < menor) {
            menor = n5;
            nomeMenor = "N2";
        }

        System.out.println(nomeMaior + " Maior: " + maior);
        System.out.println(nomeMenor + " Menor: " + menor);
    }
}