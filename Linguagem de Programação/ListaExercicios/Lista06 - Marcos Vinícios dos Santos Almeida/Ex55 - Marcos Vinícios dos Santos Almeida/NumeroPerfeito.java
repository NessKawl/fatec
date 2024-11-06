//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número");
        int num = leia.nextInt();

        int somaNum = 0;

        for (int i = 1; i < num; i++) {
            if (num  % i == 0) {
                somaNum += i;
            } 
        }

        if (somaNum == num) {
            System.out.print(num + " eh um numero perfeito!");
        } else {
            System.out.print(num + " não eh um numero perfeito!");
        }

    }
}