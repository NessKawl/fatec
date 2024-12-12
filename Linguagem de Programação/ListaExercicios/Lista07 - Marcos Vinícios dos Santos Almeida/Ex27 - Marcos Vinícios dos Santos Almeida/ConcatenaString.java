// Marcos Vinícios dos Santos Almeida

import java.util.Random;
import java.util.Scanner;

public class ConcatenaString {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitando as duas strings ao usuário
        System.out.print("Informe a primeira string: ");
        String str1 = scanner.nextLine();

        System.out.print("Informe a segunda string: ");
        String str2 = scanner.nextLine();

        // Verificando se as duas strings possuem o mesmo tamanho
        if (str1.length() == str2.length()) {
            StringBuilder concatenada = new StringBuilder();
            for (int i = 0; i < str1.length(); i++) {
                concatenada.append(str1.charAt(i)).append(str2.charAt(i));
            }
            System.out.println("Strings concatenadas: " + concatenada.toString());
        } else {
            System.out.println("As strings não possuem o mesmo tamanho.");
        }

    }

}
