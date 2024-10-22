// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class ADivisivelPorB {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("DIGITE UM VALOR ATÉ 1000: ");
        int a = leia.nextInt();
        System.out.print("DIGITE UM VALOR ATÉ 20: ");
        int b = leia.nextInt();

        if (a >= 0 && a <= 1000 && b >= 0 && b <= 20) {
            if (a % b == 0) {
                System.out.println("A é divisível por B");
            } else {
                System.out.println("A não é divisível por B");
            }
            if (a > b) {
                System.out.println("A é maior que B");
            } else {
                if (a == b) {
                    System.out.println("A é igual a B");
                } else {
                    System.out.println("A é menor que B");
                }
            }
        } else {
            System.out.println("VALORES INVÁLIDOS");
        }

    }

}
