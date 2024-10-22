package Aula10.ContadorPar;

import java.util.Scanner;

public class ContadorPar {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int contador = 0;

        for (int numero = 1; numero != 0; ) {
            System.out.print("Entre com um número inteiro [zero para sair]");
            numero = leia.nextInt();
            
            if (numero % 2 == 0 && numero != 0) {
                contador++;
            }
        }

        System.out.print("Qtd de números pares: " + contador);

    }
}
