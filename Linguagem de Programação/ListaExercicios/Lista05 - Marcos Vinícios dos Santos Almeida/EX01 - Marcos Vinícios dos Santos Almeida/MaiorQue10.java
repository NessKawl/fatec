// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class MaiorQue10 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        int valor = leia.nextInt();

        if (valor > 10) {
            System.out.print("É MAIOR QUE 10!");
        } else {
            System.out.print("NÃO É MAIOR QUE 10!");
        }

    }
}