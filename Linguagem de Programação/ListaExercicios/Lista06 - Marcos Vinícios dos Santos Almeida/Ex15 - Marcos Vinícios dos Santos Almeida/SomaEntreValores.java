// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class SomaEntreValores {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1, n2, contador, soma;
        
        System.out.print("Digite um número: ");
        n1 = leia.nextInt();

        System.out.print("Digite outro número: ");
        n2 = leia.nextInt();
        
        contador = n1;
        soma = 0;

        if (n2 > n1) {
            while (contador <= n2) {
                soma += contador;
                contador++;
            }
        } else {
            while (contador >= n2) {
                soma += contador;
                contador--;
            }
        }
        System.out.println("Soma: " + soma);
    }
}