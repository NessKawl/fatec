// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int n1 = leia.nextInt();
        System.out.print("Entre com outro valor: ");
        int n2 = leia.nextInt();

    
        if ( n1 != n2) {
            if (n1 > n2) {
                System.out.println("O maior valor é: " + n1);
            } else {
                System.out.println("O maior valor é: " + n2);
            }
        } else {
            System.out.print("Digite valores diferentes!!"); 
        }


    }
}