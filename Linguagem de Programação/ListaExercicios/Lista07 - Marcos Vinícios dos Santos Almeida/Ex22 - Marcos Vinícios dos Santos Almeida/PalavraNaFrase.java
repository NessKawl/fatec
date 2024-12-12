// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class PalavraNaFrase {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Lendo a frase do usuário
        System.out.print("Informe uma frase: ");
        String frase = scanner.nextLine();

        // Lendo a palavra para contar
        System.out.print("Informe a palavra que deseja contar: ");
        String palavra = scanner.nextLine();

        // Contando as ocorrências da palavra na frase
        int count = 0;
        String[] palavras = frase.split("\\s+"); // Dividindo a frase por espaços

        for (String p : palavras) {
            if (p.equalsIgnoreCase(palavra)) { // Comparando de forma insensível a maiúsculas e minúsculas
                count++;
            }
        }

        // Exibindo o resultado
        System.out.println("A palavra '" + palavra + "' ocorre " + count + " vezes na frase.");


    }

}
