// Marcos Vinícios dos Santos Almeida

import java.util.Random;
import java.util.Scanner;

public class DobraString {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitando a String ao usuário
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        // Calculando a posição do meio
        int meio = input.length() / 2;

        // Dividindo a string ao meio
        String parte1 = input.substring(0, meio);
        String parte2 = input.substring(meio);

        // Concatenando as partes
        String resultado = parte1 + parte2;

        // Exibindo o resultado
        System.out.println("String dobrada:"  + resultado);


    }

}
