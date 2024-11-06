//Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class NumeroPerfeito2 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("NUMEROS PERFEITOS");
        System.out.print("Digite a quantidade de termos: ");
        int qtdTermos = leia.nextInt();
        System.out.println("Sequência de " + qtdTermos + " numeros perfeitos");


        int somaNum = 0, contador = 0;
        long num = 1;
        
        do {

            somaNum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    somaNum += i;
                }
            }

            if (somaNum == num) {
                System.out.print(num + " ");
                contador++;
            }

            num++;

        } while (contador < qtdTermos);

    }
}