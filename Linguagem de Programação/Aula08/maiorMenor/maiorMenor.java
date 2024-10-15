package Aula08.maiorMenor;

import java.util.Scanner;

public class maiorMenor {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, n3, n4, n5;

        System.out.println("Insira o primeiro numero");
        n1 = leia.nextInt();
        System.out.println("Insira o segundo numero");
        n2 = leia.nextInt();
        System.out.println("Insira o terceiro numero");
        n3 = leia.nextInt();
        System.out.println("Insira o quarto numero");
        n4 = leia.nextInt();
        System.out.println("Insira o quinto numero");
        n5 = leia.nextInt();

        int maior, menor;

        if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
            maior = n1;
        } else {
            if (n2 > n3 && n2 > n4 && n2 > n5) {
                maior = n2;
            } else {
                if (n3 > n4 && n3 > n5) {
                    maior = n3;
                } else {
                    if (n4 > n5) {
                        maior = n4;
                    } else {
                        maior = n5;
                    }
                }
            }
        }

        if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
            menor = n1;
        } else {
            if (n2 < n3 && n2 < n4 && n2 < n5) {
                menor = n2;
            } else {
                if (n3 < n4 && n3 < n5) {
                    menor = n3;
                } else {
                    if (n4 < n5) {
                        menor = n4;
                    } else {
                        menor = n5;
                    }
                }
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}