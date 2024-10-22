package Aula10.ContadorDezenaPar;

import java.util.Scanner;

public class ContadorDezenaPar {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int num = leia.nextInt();

        if ((num / 10) % 2 == 0) {
            System.out.print("A dezena é PAR");
        } else {
            System.out.print("A dezena é IMPAR");
        }
    }

}