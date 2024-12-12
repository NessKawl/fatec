// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class Sobrenome {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Lendo o nome completo do usuário
        System.out.print("Informe o nome completo: ");
        String nomeCompleto = scanner.nextLine();

        // Dividindo o nome completo em partes
        String[] partesNome = nomeCompleto.split(" ");

        // Verificando se o nome tem sobrenome
        if (partesNome.length > 1) {
            // Exibindo o último elemento como sobrenome
            System.out.println("Sobrenome: " + partesNome[partesNome.length - 1]);
        } else {
            System.out.println("Nome não possui sobrenome.");
        }



    }

}
