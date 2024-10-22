package Aula10.Fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int num, fatorial, contador;
        
        System.out.print("Informe um número: ");
        num = leia.nextInt();

        fatorial = 1;
        contador = num;

        do {
            fatorial *= contador;
            contador--;
        } while (contador >= 1);


        System.out.print("Fatorial: " + fatorial);
    }
}
