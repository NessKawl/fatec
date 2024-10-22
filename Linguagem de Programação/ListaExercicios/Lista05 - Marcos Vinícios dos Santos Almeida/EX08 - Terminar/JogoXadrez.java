// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class JogoXadrez {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com a hora de início: ");
        int n1 = leia.nextInt();
        System.out.print("Entre com a hora de término: ");
        int n2 = leia.nextInt();

    
            if (n1 < n2) {
                System.out.println(n1 + ", " + n2);
            } else {
                System.out.println(n2 + ", " + n1);
            }

    }
}