// Marcos Vinícios dos Santos Almeida

import java.util.Random;
import java.util.Scanner;

public class CriptografiaROT13 {
    
    // Método para criptografar utilizando a cifra ROT-13
    public static String criptografar(String texto) {
        StringBuilder criptografado = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    criptografado.append((char) ((c - 'A' + 13) % 26 + 'A'));
                } else {
                    criptografado.append((char) ((c - 'a' + 13) % 26 + 'a'));
                }
            } else {
                criptografado.append(c);
            }
        }
        return criptografado.toString();
    }

    // Método para descriptografar utilizando a cifra ROT-13
    public static String descriptografar(String texto) {
        return criptografar(texto);  // Utilizando a mesma lógica para criptografar e descriptografar
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1 – Criptografar");
            System.out.println("2 – Descriptografar");
            System.out.println("3 – Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumindo o newline restante

            switch (opcao) {
                case 1:
                    System.out.print("Informe o texto para criptografar: ");
                    String textoPlano = scanner.nextLine();
                    String textoCriptografado = criptografar(textoPlano);
                    System.out.println("Texto criptografado: " + textoCriptografado);
                    break;

                case 2:
                    System.out.print("Informe a mensagem cifrada para descriptografar: ");
                    String mensagemCifrada = scanner.nextLine();
                    String mensagemOriginal = descriptografar(mensagemCifrada);
                    System.out.println("Mensagem descriptografada: " + mensagemOriginal);
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

    }
}
