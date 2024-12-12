// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class PalavraPorLinha {
    
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        String frase = "";

        // Solicita a entrada da frase ao usuário
        System.out.print("Digite uma frase: ");
        frase = leia.nextLine();

        // Divide a frase em palavras e imprime cada palavra em uma linha
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }



    }

}
