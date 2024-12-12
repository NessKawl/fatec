// Marcos Vinícios dos Santos Almeida

import java.util.Scanner;

public class RepeticaoNum {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Lendo a sequência de dígitos
        System.out.print("Informe uma sequência de dígitos (0's e 1's): ");
        String sequencia = scanner.nextLine();

        int maxCount = 0;  // Armazena o tamanho máximo da sequência de 1's
        int currentCount = 0;  // Contador atual de 1's consecutivos

        // Percorrendo a sequência
        for (char c : sequencia.toCharArray()) {
            if (c == '1') {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;  // Reseta o contador quando o dígito não é 1
            }
        }

        // Exibindo o resultado
        System.out.println("A maior sequência consecutiva de 1's tem tamanho: " + maxCount);

    }

}
