// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Fatorial3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num, contador = 1;

        
        do {
            System.out.print( contador + " - Digite um número para mostrar seu fatorial: ");
            num = leia.nextInt();
    
            int fatorial = num;
    
            while (num > 1) {
                fatorial = fatorial * (num-1); 
                System.out.print(num + " * ");
                num--;
    
            }
            System.out.print("= " + fatorial);
            System.out.println("");
            contador++;
        } while (contador <= 7);
    }
}